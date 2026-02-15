package common;

import java.io.*;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.*;

public class ExtentReportListener {

	private static ExtentReports extent;
	private static ExtentTest test;
	public static String reportextentLog = "";
	static String path = System.getProperty("user.dir");

	// Setup the Extent Report before the first scenario runs
	@Before
	public void setup(Scenario scenario) {
		String congipath = Paths.get(path.toString(), "src", "test", "java", "Configuration.xml").toString();
		CommonUtil.loadXMLConfigurationFile(congipath);
		String datapath = Paths.get(path.toString(), "src", "test", "java", "TestData.json").toString();
		CommonUtil.loadJSONTestData(datapath);

		// Here we are looking for the feature tag "@Feature:"
		String featureName = scenario.getSourceTagNames().stream().filter(tag -> tag.startsWith("@Feature"))
				.map(tag -> tag.replace("@Feature:", "").trim()).findFirst().orElse("");

		// Initialize the reporting system if needed (as you already have)
		if (extent == null) {
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			timeStamp = "Extent_" + timeStamp;
			String reportDirPath = System.getProperty("user.dir") + "/ExtentReports/" + timeStamp;
			File reportDir = new File(reportDirPath);
			if (!reportDir.exists()) {
				reportDir.mkdirs(); // Create directories if they don't exist
			}

			String reportFilePath = reportDirPath + "/Report.html";

			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportFilePath);
			htmlReporter.config().setTheme(Theme.DARK);
			htmlReporter.config().setDocumentTitle("BDD Test Report");
			htmlReporter.config().setReportName("Automation Test Report");

			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
		}

		// Create report entry with the feature name
		test = extent.createTest(scenario.getName());
		test.info(featureName);
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		try {
			String stepName = StepListener.stepName;
			String finalLog = stepName + "<br>" + reportextentLog.replace("\n", "<br>");

			if (scenario.isFailed()) {
				test.fail("Step Failed: " + stepName);
				System.out.println("Failed Step: " + stepName); // Log to Console
			} else {
				test.pass(finalLog);
			}
		} catch (Exception ex) {
			System.err.println("Error in afterStep: " + ex.getMessage());
		} finally {
			reportextentLog = "";
		}
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			test.log(Status.FAIL, "Scenario Failed: " + scenario.getName());
		} else {
			test.log(Status.PASS, "Scenario Passed: " + scenario.getName());
		}
	}

	@AfterAll
	public static void flushReport() {
		if (extent != null) {
			extent.flush();
		}
	}
}

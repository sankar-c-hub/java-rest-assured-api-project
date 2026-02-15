package workflows;

import common.*;

public class SeleniumWorkFlow {

	static String baseurl = CommonUtil.getJSONTestData("Baseurl");

	public void setAPIEndpoint(String param) {

		param = CommonUtil.getJSONTestData(param);
		param = param.replace("{{Baseurl}}", baseurl);
		ApiRestAssured.setApiUrl(param);
		ExtentReportListener.reportextentLog = param;

	}

	public void setAPIMethod(String param) {
		param = CommonUtil.getJSONTestData(param);
		ApiRestAssured.setApiMethodType(param);
		ExtentReportListener.reportextentLog = param;
	}

	public void setAPIRequest(String param) {
		param = CommonUtil.getJSONTestData(param);
		ApiRestAssured.setApiRequestPayload(param);
		ExtentReportListener.reportextentLog = param;

	}

	public void setAPIHeaders(String param) {

		param = CommonUtil.getJSONTestData(param);
		ApiRestAssured.setApiHeaders(param);
		ExtentReportListener.reportextentLog = param;
	}

	public boolean executeAPIAndVerify(String param) {
		param = CommonUtil.getJSONTestData(param);
		boolean result = ApiRestAssured.verifyApiUrl(param);
		return result;
	}

	public void getAcessTokenFromResponse(String param) {
		param = CommonUtil.getJSONTestData(param);
		ApiRestAssured.setAcessToken(param);
	}

	public void setQueryParam(String queryParam) {
		queryParam = CommonUtil.getJSONTestData(queryParam);
		ApiRestAssured.setApiQueryParam(queryParam);

	}

}
package stepdefinitions;

import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;

import static org.testng.Assert.assertTrue;

public class HomePageStepDefinition {
	SeleniumWorkFlow workFlow = new SeleniumWorkFlow();

	@Given("^I have access to API URL$")
	public void iHaveAccessToAPIUrl() {
		// Implement logic if needed
	}

	@When("^I set API endpoint in Update pet API as '([^']*)'$")
	public void iSetAPIEndpointInUpdatePetAPI(String url) {
		workFlow.setAPIEndpoint(url);
	}

	@When("^I set API Method in Update pet API as '([^']*)'$")
	public void iSetAPIMethodInUpdatePetAPI(String method) {
		workFlow.setAPIMethod(method);
	}

	@When("^I set API Request in Update pet API as '([^']*)'$")
	public void iSetAPIRequestInUpdatePetAPI(String request) {
		workFlow.setAPIRequest(request);
	}

	@When("^I set API Headers in Update pet API as '([^']*)'$")
	public void iSetAPIHeadersInUpdatePetAPI(String headers) {
		workFlow.setAPIHeaders(headers);
	}

	@Then("^execute API and verify in Update pet API as '([^']*)'$")
	public void executeAPIAndVerifyUpdatePetAPI(String expectedOutput) {
		assertTrue(workFlow.executeAPIAndVerify(expectedOutput));
	}

	@When("^I set API endpoint as '([^']*)'$")
	public void iSetAPIEndpointAs(String url) {
		workFlow.setAPIEndpoint(url);
	}

	@When("^I set API Method as '([^']*)'$")
	public void iSetAPIMethodAs(String method) {
		workFlow.setAPIMethod(method);
	}

	@When("^I set API Request Body as '([^']*)'$")
	public void iSetAPIRequestBodyAs(String requestBody) {
		workFlow.setAPIRequest(requestBody);
	}

	@When("^I set API Headers as '([^']*)'$")
	public void iSetAPIHeadersAs(String headers) {
		workFlow.setAPIHeaders(headers);
	}

	@Then("^I execute API request and verify response as '([^']*)'$")
	public void iExecuteAPIRequestAndVerifyResponse(String expectedStatusCode) {
		assertTrue(workFlow.executeAPIAndVerify(expectedStatusCode));
	}

	@When("^I set API endpoint in Order Density api as '([^']*)'$")
	public void iSetAPIEndpointInOrderDensityAPI(String url) {
		workFlow.setAPIEndpoint(url);
	}

	@When("^I set API Parameter in Order Density api as '([^']*)'$")
	public void iSetAPIParameterInOrderDensityAPI(String params) {
		workFlow.setQueryParam(params);
	}

	@Then("^execute API and verify in Order Density api as '([^']*)'$")
	public void executeAPIAndVerifyInOrderDensityAPI(String expectedOutput) {
		assertTrue(workFlow.executeAPIAndVerify(expectedOutput));
	}

	@Then("^execute API and verify in Get orders in the inflight tab api as '([^']*)'$")
	public void executeAPIAndVerifyInGetOrdersInInflightTabAPI(String expectedOutput) {
		assertTrue(workFlow.executeAPIAndVerify(expectedOutput));
	}

	@When("I set API endpoint in Get pet details API as {string}")
	public void i_set_api_endpoint_in_get_pet_details_api_as(String URL) {
		workFlow.setAPIEndpoint(URL);
	}

	@And("I set API Method in Get pet details API as {string}")
	public void i_set_api_method_in_get_pet_details_api_as(String method) {
		workFlow.setAPIMethod(method);
	}

	@And("I set API Headers in Get pet details API as {string}")
	public void i_set_api_headers_in_get_pet_details_api_as(String apiHeader) {
		workFlow.setAPIHeaders(apiHeader);
	}

	@And("I set API Parameter in Get pet details API as {string}")
	public void i_set_api_parameter_in_get_pet_details_api_as(String apiParameterType) {
		workFlow.setQueryParam(apiParameterType);
	}

	@Then("execute API and verify in Get pet details API as {string}")
	public void execute_api_and_verify_in_get_pet_details_api_as(String expectedOutput) {
		assertTrue(workFlow.executeAPIAndVerify(expectedOutput));
	}

	@When("I set the API endpoint to fetch order details as {string}")
	public void i_set_the_api_endpoint_to_fetch_order_details_as(String URL) {
		workFlow.setAPIEndpoint(URL);
	}

	@And("I specify the request method as {string}")
	public void i_specify_the_request_method_as(String method) {
		workFlow.setAPIMethod(method);
	}

	@And("I add the required request headers {string}")
	public void i_add_the_required_request_headers(String apiHeader) {
		workFlow.setAPIHeaders(apiHeader);
	}

	@And("I include query parameters in the request {string}")
	public void i_include_query_parameters_in_the_request(String apiParameterType) {
		workFlow.setQueryParam(apiParameterType);
	}

	@Then("I execute the request and validate the response for Assure Safeguard API {string}")
	public void i_execute_the_request_and_validate_the_response_for_assure_safeguard_api(String expectedOutput) {
		assertTrue(workFlow.executeAPIAndVerify(expectedOutput));
	}
}
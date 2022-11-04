package Stepdefination;

import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetByNameRequest {
	Response res;
	ValidatableResponse validate;
	@When("User waqnt to read the data by usingthe URI as {string}")
	public void user_waqnt_to_read_the_data_by_usingthe_uri_as(String s1) {
		 res=RestAssured.get(s1);
	}

	@Then("User want to verify the status Code as {int}")
	public void user_want_to_verify_the_status_code_as(Integer s2) {
		 validate.assertThat().statusCode(s2);
		 validate.body("message",equalTo("Successfull"));
	}
}
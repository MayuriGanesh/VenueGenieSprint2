package Stepdefination;

import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteByIdRequest {
	Response res;
	ValidatableResponse validate;
	@When("User want to delete user by using  URI as {string}")
	public void user_want_to_delete_user_by_using_uri_as(String s1) {
		res=RestAssured.get(s1);
	}

	@Then("verify the status code is {int}")
	public void verify_the_status_code_is(Integer s2) {
		 validate.assertThat().statusCode(s2);
		 validate.body("message",equalTo("Successfull"));
	}
}
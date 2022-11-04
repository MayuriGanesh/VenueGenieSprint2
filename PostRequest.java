package Stepdefination;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import java.net.URI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {


Response res;
RequestSpecification req;
ValidatableResponse validate;

@Given("User wants to create new data in database")
public void user_wants_to_create_new_data_in_database() {
	JSONObject obj=new JSONObject();
    obj.put("name","Pratik");
    obj.put("no_of_rooms",7);
    obj.put("rent_per_day",4000);
    obj.put("swimming pool","Available");
    obj.put("id",81);
    req=RestAssured.given()
    		.body(obj)
    		.contentType(ContentType.JSON);
}

@When("User create data by using URI as\"http:\\/\\/localhost:{int}\\/farmhouses\"")
public void user_create_data_by_using_uri_as_http_localhost_farmhouses(URI URI) {
   res=req.when().post(URI);
}

@Then("verify the statuscode as {int}")
public void verify_the_statuscode_as(Integer int2) {
   validate.statusCode(int2);
   validate.body("message",equalTo("Successfull"));



}

}


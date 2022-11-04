package Operations;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType;
public class GetAll 
{
	@Test
	public void getAll()
	{
		RestAssured.when()
		.get(" http://localhost:8080/farmhouses/getall")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.assertThat().body("message",equalTo("Successfull"))
		.and()
		.log().all();
	}

}



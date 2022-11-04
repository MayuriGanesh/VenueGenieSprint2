package Operations;
import org.testng.annotations.Test;
import BasePackage.Base;

import static org.hamcrest.Matchers.equalTo;
import static org.testng.annotations.Test.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.baseURI;

public class GetId extends Base
{
	@Test
	public void getById() 
	{
		baseURI="http://localhost:8080";
		RestAssured.when()
		.get("farmhouses/id/76")
		
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().body("message",equalTo("Found Successfully") )
	
		
		.log().all();
		}
}

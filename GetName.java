package Operations;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import BasePackage.Base;
import io.restassured.http.ContentType;
public class GetName extends Base
{
	@Test
	public void getName()
	{
	   when()
	   .get("http://localhost:8080/farmhouses/name/Anvi")
	   .then()
	   .assertThat().statusCode(200)
	   .assertThat().contentType(ContentType.JSON)
	   .assertThat().body("message",equalTo("Successfull"))
	   .log().all();	
	}
}
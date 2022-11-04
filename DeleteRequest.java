package Operations;
import org.testng.annotations.Test;

import BasePackage.Base;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class DeleteRequest extends Base
{
	@Test
	public void deleteById()
	{
		
		when()
		.delete("http://localhost:8080/farmhouses/48")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().body("message",equalTo("Successfull"))
		.assertThat().statusCode(200)
		
		.log().all();
		
	}

}
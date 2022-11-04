package Operations;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import BasePackage.Base;
import io.restassured.http.ContentType;
public class GetRequest extends Base{
	@Test
	public void get()
	{
		
		when()
		.get("http://localhost:8080/farmhouses?highPrice=7000&lowPrice=2000")
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.assertThat().body("message",equalTo("Successfull"))
		.log().all();
	}
}







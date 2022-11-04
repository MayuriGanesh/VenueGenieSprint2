package Operations;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import BasePackage.Base;
import io.restassured.http.ContentType;

import BasePackage.Base;

public class PostRequest extends Base {
	@Test
	
public void post()
{
	JSONObject obj=new JSONObject();
	obj.put("name","Anvi");
	obj.put("no_of_rooms","2");
	obj.put("rent_per_day","5000");
	obj.put("swimming_pool","ABC");
	obj.put("id","0");
	given()
	.contentType(ContentType.JSON)
	.body(obj)
	.when()
	.post(" http://localhost:8080/farmhouses")
	.then()
	.assertThat().body("message",equalTo( "Successfull"))
	.assertThat().contentType(ContentType.JSON)
	.assertThat().statusCode(200)
	.log().all();
}
	
}

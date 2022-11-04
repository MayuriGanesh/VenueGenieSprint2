package Authentication;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
public class GetAuthorization {

	public static void main(String[] args) {
		baseURI="https://github.com";
		
		given().auth().basic("mayugaborle18@gmail.com","devansh@1.")
		
		.when().get("/login")
		.then().log().all();

	}

}

package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getBearerUsingHeader {
	@Test
	public void fetchBearerUsingHeader()
	{
		given().headers("Authorization", "Bearer"+" 123456tytfvg").log().all() //headers("Authorization", "Bearer 123456tytfvg")
		
		.when().get("https://httpbin.org/bearer")
		
		.then().log().all();
	}
}

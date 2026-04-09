package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getBearer {
@Test
public void fetchBearer()
{
	given().auth().oauth2("12345tytfvg").log().all()
	
	.when().get("https://httpbin.org/bearer")
	
	.then().log().all();
}
}

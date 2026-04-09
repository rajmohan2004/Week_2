package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getDigestAuth {
@Test
public void fetchDigestAuth()
{
	given()
	
	.when().get()
	
	.then().log().all();
}
}

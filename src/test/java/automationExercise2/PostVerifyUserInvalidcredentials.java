package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostVerifyUserInvalidcredentials {
@Test
public void verifyUserWithInvalidDetails()
{
	RestAssured.given().formParam("email", "raj@gmail.com")
    .formParam("password", "00000")
	
	.when().post("https://automationexercise.com/api/verifyLogin")
	
	.then().log().all();
}
}

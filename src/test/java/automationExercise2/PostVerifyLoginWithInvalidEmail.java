package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostVerifyLoginWithInvalidEmail {
@Test
public void verifyWithInvalidEmail()
{
	RestAssured.given().formParam("password", "12345")
	
	.when().post("https://automationexercise.com/api/verifyLogin")
	
	.then().log().all();
}
}

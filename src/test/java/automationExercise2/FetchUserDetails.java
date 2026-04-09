package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class FetchUserDetails {
@Test
public void getUserdetails()
{
	RestAssured.given().queryParam("email", "rajmohan@gmail.com")
	
	.when().get("https://automationexercise.com/api/getUserDetailByEmail")
	
	.then().log().all();
}
}

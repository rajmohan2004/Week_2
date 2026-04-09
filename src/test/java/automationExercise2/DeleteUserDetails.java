package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteUserDetails {
@Test
public void deleteUser()
{
	RestAssured.given().formParam("email","rajmohan@gmail.com")
	.formParam("password", "12345")
	
	.when().delete("https://automationexercise.com/api/deleteAccount")
	
	.then().log().all();
}
}

package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteUserLogin {
@Test
public void deleteTheLogin()
{
	RestAssured.given()
	
	.when().delete("https://automationexercise.com/api/verifyLogin")
	
	.then().log().all();
}
}

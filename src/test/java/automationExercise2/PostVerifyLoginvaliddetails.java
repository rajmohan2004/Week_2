package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostVerifyLoginvaliddetails {
@Test
public void verifyValidlogin()
{
	RestAssured.given().formParam("email", "rajmohan@gmail.com")
    .formParam("password", "12345")
    
    .when().post("https://automationexercise.com/api/verifyLogin")
    
    .then().log().all();
}
}

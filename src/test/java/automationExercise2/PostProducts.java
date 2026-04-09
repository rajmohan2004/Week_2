package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostProducts {
@Test
public void postTheProducts()
{
	RestAssured.given()
	
	.when().post("https://automationexercise.com/api/productsList")
	
	.then().log().all();
}
}

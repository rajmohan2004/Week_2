package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutTheProduct {
@Test
public void updateTheProduct()
{
	RestAssured.given()
	
	.when().put("https://automationexercise.com/api/brandsList")
	
	.then().log().all();
}
}

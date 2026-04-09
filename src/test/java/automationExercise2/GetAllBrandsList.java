package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllBrandsList {
@Test
public void getAllTheBrands()
{
	RestAssured.given()
	
	.when().get("https://automationexercise.com/api/brandsList")
	
	.then().log().all();
}
}

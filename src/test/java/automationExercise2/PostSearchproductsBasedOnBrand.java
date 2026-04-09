package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostSearchproductsBasedOnBrand {
@Test
public void searchBrands()
{
	RestAssured.given()
	
	.when().post("https://automationexercise.com/api/searchProduct")
	
	.then().log().all();
}
}

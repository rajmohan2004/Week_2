package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllProductList {
@Test
public void getAllproducts()
{
	RestAssured.given()
	
	.when().get(" https://automationexercise.com/api/productsList")
	
	.then().log().all();
}
}

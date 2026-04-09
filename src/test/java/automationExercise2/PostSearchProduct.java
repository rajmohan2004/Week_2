package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostSearchProduct {
@Test

public void searchAProduct()
{
	RestAssured.given().formParam("search_product", "top")
	
	.when().post("https://automationexercise.com/api/searchProduct")
	
	.then().log().all();
}
}

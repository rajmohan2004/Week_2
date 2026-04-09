package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetProjectIdByUsingQueryParameter {
@Test
public void getProjectByStatus()
{
	RestAssured.given()
	                   .queryParam("findByStatus", "available")
	                   
	    .when().get("https://petstore.swagger.io/v2/pet/findByStatus")
	    
	    .then().log().all();
}
}

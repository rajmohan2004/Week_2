package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdatePetByPetId {
@Test
public void updateThePet()
{
	RestAssured.given()
	           .pathParam("petId", "3")
	           .formParam("name", "Jimmy")
	           .formParam("status", "available")
	           
	         .when().post("https://petstore.swagger.io/v2/pet/{petId}")
	         
	         .then().log().all();
}
}

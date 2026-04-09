package parameters;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdatePetByFormParameters {
@Test
public void updateImage()
{
	File img_file=new File("./src/test/resources/dog.jpg");
	RestAssured.given().pathParam("petId", "3").formParam("additionalMetadata", "This is a dog").multiPart("file", img_file)
	
	.when().post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")
	
	.then().log().all();
}
}

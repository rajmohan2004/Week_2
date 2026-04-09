package parameters;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetQueryParameter {
@Test
public void getParticularProjectByIdByQueryParameter()
{
	RestAssured.given().queryParam("projectId", "NH_PROJ_3390")
	
	.when().get("http://49.249.28.218:8091/project")
	
	.then().log().all();
}
}

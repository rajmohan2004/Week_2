package responseValidation;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class DeleteTheProject {
@Test
public void deleteProject()
{
	given()
	
	.when().delete("http://49.249.28.218:8091/project/NH_PROJ_002")
	
	.then().log().all().assertThat()
	                              .statusCode(204)
	                                             .statusLine(containsString("HTTP"))
	                                                                              .time(lessThan(5000L));
}
}

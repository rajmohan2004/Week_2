package responseValidation;

import java.io.File;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutTheProject {
@Test
public void UpdateTheProject()
{
	File json_file=new File("./src/test/resources/update_data.json");
	given().contentType(ContentType.JSON).body(json_file)
	
	.when().put("http://49.249.28.218:8091/project/NH_PROJ_153")
	
	.then().log().all().assertThat()
	                               .statusCode(200)
	                                              .statusLine(containsString("HTTP"))
	                                                                                .time(lessThan(5000L));
}

}

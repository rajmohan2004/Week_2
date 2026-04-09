package responseValidation;

import java.io.File;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostTheProject {
@Test
public void createTheNewProject()
{
	File json_file=new File("./src/test/resources/create_data.json");
	given().contentType(ContentType.JSON).body(json_file)
	
	.when().post("http://49.249.28.218:8091/addProject")
	
	.then().log().all().assertThat()
	                               .statusCode(201)
	                                              .statusLine(containsString("HTTP"))
	                                                                                .time(lessThan(5000L));
}
}

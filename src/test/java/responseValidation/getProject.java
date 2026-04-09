package responseValidation;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;

public class getProject {
@Test
public void getSingleProject()
{
     given()
       .pathParam("projectId","NH_PROJ_193")
       
      .when().get("http://49.249.28.218:8091/project/{projectId}")
      
      .then().log().all()
                          .assertThat()
                                      .statusCode(200)
                                                  .statusLine(containsString("HTTP"))
                                                                               .time(lessThan(5000L));
}

}

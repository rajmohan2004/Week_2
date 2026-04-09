package gitHub;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class gitTasks {

	    String token = "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";  
	    String owner = "rajmohan2004";    
	    String reponame = "sampleRepository";
	   
@Test
public void createRepository() {
	given().header("Authorization","Bearer "+token).contentType(ContentType.JSON).body("{\"name\":\""+reponame+"\"}")

    .when().post("https://api.github.com/user/repos")

    .then().log().all().assertThat().statusCode(201).statusLine(containsString("Created")).time(lessThan(5000L)).body("name", equalTo(reponame));
    

}

@Test(dependsOnMethods = "createRepository")
public void getRepository() {

    given().pathParam("owner",owner).pathParam("repo",reponame).header("Authorization","Bearer "+token)

    .when().get("https://api.github.com/repos/{owner}/{repo}")

    .then().log().all().assertThat().statusCode(200).statusLine(containsString("OK")).time(lessThan(5000L)).body("name", equalTo(reponame));
        
}

@Test(dependsOnMethods = "getRepository")
 public void updateRepository() {

	        given().pathParam("owner",owner).pathParam("repo",reponame).header("Authorization","Bearer "+token).contentType(ContentType.JSON)
	        .body("{\"description\":\"Repository updated\"}")

	        .when().patch("https://api.github.com/repos/{owner}/{repo}")

	        .then().log().all().assertThat().statusCode(200).statusLine(containsString("OK")).time(lessThan(5000L)).body("name", equalTo(reponame)).body("description", equalTo("Repository updated"));
	            
}

 @Test(dependsOnMethods = "updateRepository")
public void deleteRepository() {

	        given().pathParam("owner", owner).pathParam("repo", reponame).header("Authorization","Bearer "+token)

	        .when().delete("https://api.github.com/repos/{owner}/{repo}")

	        .then().log().all().assertThat().statusCode(204).statusLine(containsString("No Content")).time(lessThan(5000L));
	           
	    }

}



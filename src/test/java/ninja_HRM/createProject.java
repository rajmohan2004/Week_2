package ninja_HRM;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class createProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pre-Condition 
		RestAssured.given().contentType(ContentType.JSON).body("{\"createdBy\":\"Raj\","
			    + "\"projectName\":\"ExerciseProject1001\","
			    + "\"status\":\"Ongoing\","
			    + "\"teamSize\":0}")
		
		//HTTP Method
		.when().post("http://49.249.28.218:8091/addProject")
		
		//Response
		.then().statusCode(201).log().all();
	}

}

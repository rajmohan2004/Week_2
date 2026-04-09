package ninja_HRM;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pre-Condition 
				RestAssured.given().contentType(ContentType.JSON).body("{\"createdBy\":\"Rajmohan\","
					    + "\"projectName\":\"ExerciseProject201\","
					    + "\"status\":\"Completed\","
					    + "\"teamSize\":0}")
				
				//HTTP Method
				.when().put("http://49.249.28.218:8091/project/NH_PROJ_2929")
				
				//Response
				.then().log().all();

	}

}

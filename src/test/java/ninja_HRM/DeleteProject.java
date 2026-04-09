package ninja_HRM;

import io.restassured.RestAssured;

public class DeleteProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pre-Conditions
				RestAssured.given()
				
				//HTTP Method
				.when()
				.delete("http://49.249.28.218:8091/project/NH_PROJ_1422")
				
				//Response
				.then()
				.log().all();
	}

}

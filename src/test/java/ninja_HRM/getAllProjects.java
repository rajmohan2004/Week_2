package ninja_HRM;

import io.restassured.RestAssured;

public class getAllProjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.given()
         
		
		
		//HTTP Method
		.when()
		.get("http://49.249.28.218:8091/projects")
		
		
		//Response
		.then().statusCode(200)
		.log()
		.all();
	}

}

package ninja_HRM;

import io.restassured.RestAssured;

public class getProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    //Pre-Condition	
		RestAssured.given()
         
		
		
		//HTTP Method
		.when()
		.get("http://49.249.28.218:8091/project/NH_PROJ_2929")
		
		
		//Response
		.then().statusCode(200)
		.log()
		.all();
		
	}

}

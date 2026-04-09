package dummyRestAPI;

import io.restassured.RestAssured;

public class getEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.given()
         
		
		
		//HTTP Method
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employees")
		
		
		//Response
		.then()
		.statusCode(200)
		.log()
		.all();
	}

}

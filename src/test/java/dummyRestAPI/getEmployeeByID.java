package dummyRestAPI;

import io.restassured.RestAssured;

public class getEmployeeByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

RestAssured.given()
         
		
		
		//HTTP Method
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employee/1	")
		
		
		//Response
		.then()
		.statusCode(200)
		.log()
		.all();
	}

}

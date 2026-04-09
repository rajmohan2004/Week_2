package dummyRestAPI;

import io.restassured.RestAssured;

public class deleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.given()
         
		
		
		//HTTP Method
		.when()
		.delete("https://dummy.restapiexample.com/api/v1/delete/2")
		
		
		//Response
		.then()
		.statusCode(200)
		.log()
		.all();
	}

}

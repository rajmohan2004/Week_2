package dummyRestAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given().contentType(ContentType.JSON).body(Payload1.addBody())

		//HTTP Method
		.when().post("https://dummy.restapiexample.com/api/v1/create")
		
		
		//Response
		.then().log().all();
	}

}

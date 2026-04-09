package dummyRestAPI;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postEmployee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<Object, Object> json_body = new HashMap<Object, Object>();

	        json_body.put("name", "Raj");
	        json_body.put("salary", "1000");
	        json_body.put("age", "23");
		
		
		
		RestAssured.given().contentType(ContentType.JSON).body(json_body)

		//HTTP Method
		.when().post("https://dummy.restapiexample.com/api/v1/create")
		
		
		//Response
		.then().log().all();
	}

}

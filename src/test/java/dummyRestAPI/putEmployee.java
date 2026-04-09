package dummyRestAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class putEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given().contentType(ContentType.JSON).body("{\"name\":\"abcd\",\"salary\":\"1000\",\"age\":\"25\"}")

		//HTTP Method
		.when().put("https://dummy.restapiexample.com/api/v1/update/21")
		
		
		//Response
		.then().log().all();
	}

}

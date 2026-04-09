package dummyRestAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pre-Condition
				RestAssured.given().contentType(ContentType.JSON).body("{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}")

				//HTTP Method
				.when().post("https://dummy.restapiexample.com/api/v1/create")
				
				
				//Response
				.then().log().all();
	}

}

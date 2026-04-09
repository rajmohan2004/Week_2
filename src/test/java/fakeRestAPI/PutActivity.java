package fakeRestAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "  \"id\":13,\r\n"
				+ "  \"title\": \"The Way of Water\",\r\n"
				+ "  \"dueDate\": \"2026-03-03T07:17:05.1211376+00:00\",\r\n"
				+ "  \"completed\": true\r\n"
				+ "}")
		
		.when().put("https://fakerestapi.azurewebsites.net/api/v1/Activities/12")
		.then().log().all();
	}

}

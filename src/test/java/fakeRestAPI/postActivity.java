package fakeRestAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "  \"id\":55,\r\n"
				+ "  \"title\": \"Complete API testing assignment\",\r\n"
				+ "  \"dueDate\": \"2026-03-03T07:17:05.1211376+00:00\",\r\n"
				+ "  \"completed\": false\r\n"
				+ "}")
		
		.when().post("https://fakerestapi.azurewebsites.net/api/v1/Activities")
		.then().log().all();
	}

}

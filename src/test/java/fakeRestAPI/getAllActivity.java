package fakeRestAPI;

import io.restassured.RestAssured;

public class getAllActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given()
		.when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
		.then().log().all();
	}

}

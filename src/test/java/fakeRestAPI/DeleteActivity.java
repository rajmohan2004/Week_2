package fakeRestAPI;

import io.restassured.RestAssured;

public class DeleteActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given()
		.when().delete("https://fakerestapi.azurewebsites.net/api/v1/Activities/13")
		.then().log().all();
	}

}

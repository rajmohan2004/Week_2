package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RegisterUser {
@Test
public void newUserRegister()
{
	RestAssured.given()
	.formParam("name", "Rajmohan")
    .formParam("email", "rajmohan@gmail.com")
    .formParam("password", "12345")
    .formParam("title", "Mr")
    .formParam("birth_date", "02")
    .formParam("birth_month", "11")
    .formParam("birth_year", "2004")
    .formParam("firstname", "Raj")
    .formParam("lastname", "Mohan")
    .formParam("company", "ABC Company")
    .formParam("address1", "No 10, Anna Nagar")
    .formParam("address2", "Near Bus Stand")
    .formParam("country", "India")
    .formParam("zipcode", "600001")
    .formParam("state", "Tamil Nadu")
    .formParam("city", "Chennai")
    .formParam("mobile_number", "9876543210")
    
    .when().post("https://automationexercise.com/api/createAccount")
    
    .then().log().all();
	
}
}

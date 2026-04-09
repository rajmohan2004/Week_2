package automationExercise2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateTheUser {
@Test
public void updateUser()
{
    RestAssured.given()
        .formParam("name", "Rajmohan")
        .formParam("email", "rajmohan@gmail.com")
        .formParam("password", "12345")
        .formParam("title", "Mr")
        .formParam("birth_date", "10")
        .formParam("birth_month", "05")
        .formParam("birth_year", "2003")
        .formParam("firstname", "Raj")
        .formParam("lastname", "Mohan")
        .formParam("company", "ABC Company")
        .formParam("address1", "Anna Nagar")
        .formParam("address2", "Near Bus Stand")
        .formParam("country", "India")
        .formParam("zipcode", "600001")
        .formParam("state", "Tamil Nadu")
        .formParam("city", "Chennai")
        .formParam("mobile_number", "9876543210")

    .when()
        .put("https://automationexercise.com/api/updateAccount")

    .then()
        .log().all();
}
}

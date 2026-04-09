package ninja_HRM;


import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class EmpPost {

    public static void main(String[] args) {

       
       

      
                given()
                    .contentType(ContentType.JSON)
                    .body("{\n" +
                            "  \"designation\": \"Data Analyst\",\n" +
                            "  \"dob\": \"22/11/1998\",\n" +
                            "  \"email\": \"ananya.k@test.com\",\n" +
                            "  \"empName\": \"Ananya Krishnan\",\n" +
                            "  \"experience\": 3,\n" +
                            "  \"mobileNo\": \"9123456780\",\n" +
                            "  \"project\": \"Customer Insights\",\n" +
                            "  \"role\": \"Analyst\",\n" +
                            "  \"username\": \"ananya_analyst\"\n" +
                            "}")
                .when()
                    .post("http://49.249.28.218:8091/employees")
                    
                 .then().log().all();

        System.out.println("Test executed successfully!");
    }
}
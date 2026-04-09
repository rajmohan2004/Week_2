package authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getHiddenAuth {
@Test
public void fetchHiddenAuth()
{
	 given().pathParam("user", "admin").pathParam("passwd", "password123").auth().basic("admin","password123").log().all()
	 
	 .when().get("https://httpbin.org/hidden-basic-auth/{user}/{passwd}")
	 
	 .then().log().all();
	 
}
}

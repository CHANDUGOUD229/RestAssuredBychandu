package testing;
import org.testng.Assert;
import org.testng.annotations.Test;
import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class TC_002_GET_Responce 
{
   @Test
	void getUserList() 
	{
	  Response  responce=get("https://reqres.in/api/users?page=2");
	  
	 System.out.println("Response asString    "+responce.asString()); ;
	 System.out.println("ResponseGetBody      "+responce.getBody()); ;
	 System.out.println("ResponsegetStatusCode    "+responce.getStatusCode());
	  System.out.println("getStatusCode    "+responce.getStatusLine());
	  System.out.println("contentType    "+responce.header("content-Type"));
	  System.out.println("responseTime     "+responce.getTime());
	  int statuscode=responce.getStatusCode();
	  Assert.assertEquals(statuscode, 200);
	  
	  
	  
	}
     @Test
     void test_02()
     {
    	 given()
    	 .get("https://reqres.in/api/users?page=2")
    	 .then()
    	 .statusCode(200)
    	 .body("data.id[1]", equalTo(8))
    	 .log().all();
    	 
    	 
    	 
    	 
    	 
    	 
     }
     
     
     
	
	
	
	
}

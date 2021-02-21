package testing;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;


public class TC_001_Requests 
{	
	@Test(priority=1,enabled=true)
	void test_Get()
	{
		System.out.println(".............Get Code...............");
	     	given().get("https://reqres.in/api/users?page=2")
	     	.then()
	     	.statusCode(200)
	     	.body("data.id[2]", equalTo(9))
	     	.body("data.last_name", hasItems("Lawson","Ferguson","Funke","Fields"))
	     	.log().all();
	}
	@Test(priority=2,enabled=false)
	void test_Post()
	{
		System.out.println(".............Post Code...............");
		JSONObject request=new JSONObject();
		request.put("name", "chandra shekhar");
		request.put("job", "Software Engineer");
//		System.out.println(request);
//		System.out.println(request.toJSONString());
		given()
		.header("contentType","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
		
	}

	@Test(priority=3,enabled=false)
	void test_Put()
	{
		System.out.println(".............Put Code...............");
		JSONObject request=new JSONObject();
		request.put("name", "chandra ");
		request.put("job", "Software ");
//		System.out.println(request);
//		System.out.println(request.toJSONString());
		given()
		.header("contentType","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("https://reqres.in/api/users")
		.then()
		.statusCode(200)
		.log().all();
		
	}
	@Test(priority=4,enabled=false)
	void test_Patch()
	{
		System.out.println(".............Patch Code...............");
		JSONObject request=new JSONObject();
		request.put("name", "mm ");
		request.put("job", "ss ");
//		System.out.println(request);
//		System.out.println(request.toJSONString());
		given()
		.header("contentType","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://reqres.in/api/users")
		.then()
		.statusCode(200)
		.log().all();
		
	}
	@Test(priority=5
			,enabled=false)
	void Delet()
	{
		System.out.println(".............Delete Code...............");
		
		
		 when()
		.delete("https://reqres.in/api/users")
		.then()
		.statusCode(204)
		.log().all();
		
	}
	
	
	

}

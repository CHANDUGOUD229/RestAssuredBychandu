package testing;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenTesting extends DataStoringClass
{
    	
	@Test(dataProvider="DataForPost",enabled=false,priority=1)			
	void test_Post(String name,String job,String gName)
	{
		System.out.println(".............Post Code...............");
		JSONObject request=new JSONObject();
		request.put("name", name);
		request.put("job", job);
		request.put("gName", gName);

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
	@Parameters({"userid"})
	@Test
	void Delet(int chinne)
	{
		System.out.println(".............Delete Code...............");
		System.out.println("userid :"+chinne);
		
		 when()
		.delete("https://reqres.in/api/users/"+chinne)
		.then()
		.statusCode(204)
		.log().all();
		
	}





}

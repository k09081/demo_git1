package Stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Addplace;
import pojo.location;
import resource.APIResources;
import resource.testdatabuild;
import resource.utility;

public class Definitions extends utility {
	
	RequestSpecification res;
	Response response3;
	ResponseSpecification response;
	
	testdatabuild data=new testdatabuild();
	
	
	@Given("Add place payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
	    res= given().spec(requestSpecification()).body(data.addplacePayload(name, language, address));
	}

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resources, String httpmethods) {
// Note: constructor will be called with value of "resource" which you pass.	    
		APIResources resour=APIResources.valueOf(resources);
		System.out.println(resour.getresource());
		
		response=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		 
		if(httpmethods.equalsIgnoreCase("POST")) {
			
			response3=res.when().post(resour.getresource()).then().spec(response).extract().response();
		}
		else if(httpmethods.equalsIgnoreCase("GET")) {
			response3=res.when().get(resour.getresource()).then().spec(response).extract().response();
		}
	}
	@Then("the Api call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
		
		assertEquals(response3.getStatusCode(),200);
	    
	}
	
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyvalue, String Expectedvalue) {
	   
		String resp=response3.asString();
		JsonPath js=new JsonPath(resp);
		//assertEquals(js.get(keyvalue).toString(),Expectedvalue);
	    
	}

}

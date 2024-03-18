package pojo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import java.util.ArrayList;
import java.util.List;

public class serializetest {

	public static void main(String[] args) {
		
		Addplace p =new Addplace();
		p.setName("garfar lane");
		p.setAccuracy(50);
		p.setPhone_number("12165965623232");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setLanguage("sdhjaHJHJA");
		p.setAddress("29, side layout, cohen 09");
		location l= new location();
		l.setLat(58);
		l.setLng(98);
		List<String> list= new ArrayList<String>();
		list.add("shoe park");
		list.add("shop");

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String res1 = given().log().all().queryParam("key", "qaclick123").body(p).when()
				.post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();
		//String response=res1.toString();
		System.out.println(res1);
		

	}
}

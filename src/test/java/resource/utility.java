package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class utility {

	public static RequestSpecification requestspec3;
	public RequestSpecification requestSpecification() throws IOException {
		
		if(requestspec3==null) {
		
		PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
		
		requestspec3=new RequestSpecBuilder().setBaseUri(getglobalvalue("baseurl")).addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log)).addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).build();
		
		return  requestspec3;
		}
		return requestspec3;
	}
	
	public static String getglobalvalue(String key) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\saksh\\Cucumberproject\\src\\test\\java\\resource\\global.properties");
		prop.load(fis);
		
		return prop.getProperty(key);
	}
}

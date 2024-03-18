package resource;

import java.util.ArrayList;
import java.util.List;

import pojo.Addplace;
import pojo.location;

public class testdatabuild {
	
	
	public Addplace addplacePayload(String name,String language,String address) {
		
		Addplace p =new Addplace();
		p.setName(name);
		p.setAccuracy(50);
		p.setPhone_number("12165965652163232");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setLanguage(language);
		p.setAddress( address);
		location l= new location();
		l.setLat(58);
		l.setLng(98);
		List<String> list= new ArrayList<String>();
		list.add("shoe parxk");
		list.add("shops");
		
		return p;
	}

}

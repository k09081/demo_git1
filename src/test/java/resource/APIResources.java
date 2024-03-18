package resource;

public enum APIResources {
	
	AddPlaceApi("maps/api/place/add/json"),
	getPlaceApi("maps/api/place/get/json"),
	deletePlaceApi("maps/api/place/delete/json");
	
	private String resource;
	private APIResources(String resource) {
		
		this.resource=resource;
	}
	
	public String getresource() {
		
		return resource;
	}

}

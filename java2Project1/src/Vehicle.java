
/*
 * JD Baudean
 * Project 1
 * CMIS242 OL4	
 */

public class Vehicle {
	
	private String make;
	private String model;
	private String name;
	private String license;
	
	public Vehicle(String make, String model) {
		this.setMake(make);
		this.setModel(model);
		this.setLicenseType(this);
	}
	
	public Vehicle() {
		this(null, null);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getModel() {
		return this.model;
	}
	public String getMake() {
		return this.make;
	}
	
	public void setLicenseType(Vehicle object) {
		if (object instanceof Car) {
			this.license = "Regular";
		} else if (object instanceof Truck) {
			this.license = "Regular";
		} else if (object instanceof Bus) {
			this.license = "Commercial";
		} else if (object instanceof Motorcycle) {
			this.license = "Moto";
		} else this.license = "";
	}
	
	public String getLicenseType() {
		return this.license;
	}

}

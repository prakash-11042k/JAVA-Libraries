package Com;

public class Car {

	private String brand;
	private String model;
	private double price;
	private Engine engine;
	
	
	public Car (String brand,String model,double price,Engine engine) {
		this.price=price;
		this.brand=brand;
		this.model=model;
		this.engine=engine;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public Engine getEngine() {
		return engine;
	}
}

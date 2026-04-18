package Com;

public class Product {

	private int id;
	private String name;
	private String brand;
	private double price;
	
    public Product(int id,String name,String brand,double price) {
    	this.id=id;
    	this.name=name;
    	this.brand=brand;
    	this.price=price;
    } 

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
}

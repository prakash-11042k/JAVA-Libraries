package Com;

public class MainClass {

	public static void main(String[] args) {
		
		Car c=new Car("BMW","M5",2000000,new Engine("1000cc","Petrol"));
		
		System.out.println("Car Brand="+c.getBrand());
		System.out.println("Car Model="+c.getModel());
		System.out.println("Car Price="+c.getPrice());
		System.out.println("Car CC="+c.getEngine().getCC());
		System.out.println("Car Type="+c.getEngine().getType());
	}
}

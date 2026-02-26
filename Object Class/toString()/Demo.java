package Com;

public class Demo {

	public static void main(String[] args) {
		
		Demo d= new Demo();
		
		// Implicitly calls toString()
		System.out.println(d);
		
		// Explicitly calls toString()
		System.out.println(d.toString());
	}
}

package Com;

public class Demo1 {

	public String toString() {
		return "FAAAAAA";
	}
	
	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		
		// Implicitly calls toString()
		System.out.println(d);
		
		// Explicitly calls toString()
		System.out.println(d.toString());
	}
}

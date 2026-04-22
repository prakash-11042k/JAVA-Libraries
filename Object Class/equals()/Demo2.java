package Com;

public class Demo2 {

	public static void main(String[] args) {
		
		Demo2  d1=new Demo2();
		Demo2  d2=new Demo2();
		
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2)); // Before overriding
		
	}
}

package Com;

public class MainClass17 {
	
	public static void main(String[] args) {
		
		User2 u1=new User2("Balaji",9876543210l);
		User2 u2=new User2("Vijay",1234567890l);
		User2 u3=new User2("Balaji",9876543210l);
		
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
	}
}

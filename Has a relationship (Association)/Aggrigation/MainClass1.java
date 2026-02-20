package Com;

public class MainClass1 {

	public static void main(String[] args) {
		
		Mobile m=new Mobile();
		m.setBrand("Vivo");
		m.setModel("T2Pro");
		m.setColor("Golden White");
		m.setPrice(22500);
		
		Person p=new Person();
		p.setName("Veera");
		p.setGender("Male");
		p.setAge(10);
		p.setPhone(894052026);
		p.setMobile(m);
		
		System.out.println("Name="+p.getName());
		System.out.println("Gender="+p.getGender());
		System.out.println("Age="+p.getAge());
		System.out.println("Phone="+p.getPhone());
		
		System.out.println("-------------------------");
		
		System.out.println("Brand="+m.getBrand());
		System.out.println("Model="+m.getModel());
		System.out.println("Color="+m.getColor());
		System.out.println("Price="+m.getPrice());
	}
}

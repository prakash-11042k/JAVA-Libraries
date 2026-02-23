package Com;

public class MainClass2 {

	public static void main(String[] args) {
		
		Student s=new Student(1234,"Veera","Male",new Degree("BE","CSE",2023));
		System.out.println("RollNo="+s.getRollno());
		System.out.println("Name="+s.getName());
		System.out.println("Gender="+s.getGender());
		System.out.println("Degree="+s.getDegree().getDegree());
		System.out.println("Stream="+s.getDegree().getStream());
		System.out.println("YOP="+s.getDegree().getYOP());
	}
}

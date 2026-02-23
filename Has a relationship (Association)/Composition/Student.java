package Com;

public class Student {

	private int rollno;
	private String name;
	private String gender;
	private Degree degree;
	
	public Student(int rollno,String name,String gender,Degree degree) {
		this.rollno=rollno;
		this.name=name;
		this.gender=gender;
		this.degree=degree;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public Degree getDegree() {
		return degree;
	}
}

package Com;

public class Employee6 {

	int id;
	String name;
	double salary;
	
	public Employee6(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

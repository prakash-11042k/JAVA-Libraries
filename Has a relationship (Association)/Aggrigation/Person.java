package Com;

public class Person {

	private String name;
	private String gender;
	private int age;
	private long phone;
	private Mobile mobile;
	
	public void setMobile (Mobile mobile) {
		this.mobile=mobile;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone=phone;
	}
}

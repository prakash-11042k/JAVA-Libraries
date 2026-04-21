package Com;

import java.util.Objects;

public class User2 {

	private String name;
	private long phone;
	
	public User2(String name,long phone) {
		this.name=name;
		this.phone=phone;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,phone);
	}
	
	
}

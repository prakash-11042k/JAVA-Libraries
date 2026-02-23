package Com;

public class Degree {

	private String degree;
	private String stream;
	private int yop;
	
	public Degree(String degree,String stream,int yop) {
		this.degree=degree;
		this.stream=stream;
		this.yop=yop;
	}
	
	public String getDegree() {
		return degree;
	}
	public String getStream() {
		return stream;
	}
	public int getYOP() {
		return yop;
	}
}

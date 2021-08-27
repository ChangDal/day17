package day15;

public class Singleton {

	private String name;
	
	public Singleton(String name) {
		this.name = name;
		
	}
	public void SetName(String name) {
		this.name = name;
	}
	public String GetName() {
		return  name;
	}
}

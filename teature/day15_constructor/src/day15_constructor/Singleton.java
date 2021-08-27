package day15_constructor;

public class Singleton {
	private String name;
	public Singleton(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

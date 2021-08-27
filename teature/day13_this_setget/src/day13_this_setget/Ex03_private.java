package day13_this_setget;

public class Ex03_private {
	private String name;
	private int age;
	public void setName(String n) { name = n; }
	public void setAge(int age) { this.age = age; }
	public String getName() { return name; }
	public int getAge() { return age; }
	public void opAge() {
		age = age - 1;
	}
}

package day15_inheritance;
class Super{
	//public int num;
	//private int num;
	protected int num;
	public Super() { num = 12345; }
}
class Child extends Super{
	private int su;
	public Child() { su = 1111; }
	public void display() {
		System.out.println(super.num + " : "+ num);
		System.out.println(this.su + " : "+ su);
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}

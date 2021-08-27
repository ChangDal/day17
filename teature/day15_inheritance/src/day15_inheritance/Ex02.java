package day15_inheritance;
class Calc01{
	public Calc01(String n) {
		System.out.println(n + " : calc 积己磊 角青");
	}
	//public Calc01() {	}
}
class Com01 extends Calc01{
	public Com01() {
		super("test");
		System.out.println("com 积己磊 角青");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Com01 com = new Com01();
	}
}

package day15_inheritance;

class Calc03{
	public Calc03(String n) {
		System.out.println(n + " : calc 생성자 실행");
	}
	public void test() {
		System.out.println("calc03 test");
	}
}
class Com03 extends Calc03{
	public Com03(String s) {
		super(s);
		System.out.println("com 생성자 실행");
		this.test();
		super.test();
	}
	public void test() {
		System.out.println("Com03 test");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Com03 com = new Com03("안녕하세요");
	}
}
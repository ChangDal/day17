package day13;

public class Ex01_this {
	private int a = 10;
	
	public void func() {
		int a = 1234;
		System.out.println("func a :"+a);
		System.out.println("this =>"+this.a);
	}
	public void func02() {
		System.out.println("func02 a : "+a);
	}
}

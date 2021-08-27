package day13_this_setget;
//시작 주소 1175e2db
public class Ex01_this {
	int a=10;
	public void func() {
		int a = 1234;
		System.out.println("func a : "+a);
		System.out.println("this => "+ this.a);
		//this.func02();
	}
	public void func02() {
		System.out.println("func02 a : "+a);
	}
}
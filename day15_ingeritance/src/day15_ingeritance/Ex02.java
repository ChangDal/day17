package day15_ingeritance;

class Calc01{
	public Calc01(String n) {
		System.out.println(n+"clac 생성자 실행");
	}
	

}

class Com01 extends Calc01{
	public Com01() {
		super("test"); // 부모값
		System.out.println("com 생성자 실행");
	}
	
}
//상속은 자기 자신보다 부모먼저 실행하고 그다음 자기 자신 실행

public class Ex02 {

	public static void main(String[] args) {
		Com01 com = new Com01();
	}
}

package day15_ingeritance;

class Calc01{
	public Calc01(String n) {
		System.out.println(n+"clac ������ ����");
	}
	

}

class Com01 extends Calc01{
	public Com01() {
		super("test"); // �θ�
		System.out.println("com ������ ����");
	}
	
}
//����� �ڱ� �ڽź��� �θ���� �����ϰ� �״��� �ڱ� �ڽ� ����

public class Ex02 {

	public static void main(String[] args) {
		Com01 com = new Com01();
	}
}
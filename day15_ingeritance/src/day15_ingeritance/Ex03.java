package day15_ingeritance;



	class Calc03{
		public Calc03(String n) {
			System.out.println(n+"clac ������ ����");
			
		}
		
		public void test() {
			System.out.println("clac03 test");
		}
	}

	class Com03 extends Calc03{
		public Com03(String s) {
			super(s); // �θ�
			System.out.println("com ������ ����");
			super.test();
		}
		public void test() {
			
			System.out.println("Com03 test");
		}
		
	}
	//����� �ڱ� �ڽź��� �θ���� �����ϰ� �״��� �ڱ� �ڽ� ����

	public class Ex03 {

		public static void main(String[] args) {
			Com03 com = new Com03("�ȳ��ϼ���");
		}

}
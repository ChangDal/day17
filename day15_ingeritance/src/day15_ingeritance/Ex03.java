package day15_ingeritance;



	class Calc03{
		public Calc03(String n) {
			System.out.println(n+"clac 생성자 실행");
			
		}
		
		public void test() {
			System.out.println("clac03 test");
		}
	}

	class Com03 extends Calc03{
		public Com03(String s) {
			super(s); // 부모값
			System.out.println("com 생성자 실행");
			super.test();
		}
		public void test() {
			
			System.out.println("Com03 test");
		}
		
	}
	//상속은 자기 자신보다 부모먼저 실행하고 그다음 자기 자신 실행

	public class Ex03 {

		public static void main(String[] args) {
			Com03 com = new Com03("안녕하세요");
		}

}

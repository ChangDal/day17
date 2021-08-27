package day02_변수_연산자;

public class Ex01_변수 {
	public static void main(String args[]) {
		/*
		 정 수 : short : 2byte : -32768 ~ 32767
		 정 수 : int : 4byte : 양수 음수 대략 21억 표현
		 실 수 : float : 4byte : 양수, 음수
		 실 수 : double : 8byte : 양수, 음수
		 문 자 : byte : 1byte => 8bit : 양수, 음수 표현
		 문 자 : char : 2byte => 16bit : 양수의 값만 표현
		*/
		System.out.println("실행"+100);
		
		int age = 25;
		double weight = 50.0;
		double height = 163.5;
		
		System.out.println("당신의 나이는 "+age+"살 이군요");
		System.out.println("당신의 키는 "+weight+"cm");
		System.out.println("당신의 몸무게는 "+height+"kg");
	}
}









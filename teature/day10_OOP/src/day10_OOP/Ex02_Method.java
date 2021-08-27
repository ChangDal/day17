package day10_OOP;

import java.util.Scanner;

public class Ex02_Method {
	public static void main(String[] args) {
		Member02 mem = new Member02();
		// 1. 메소드의 호출
		// 2. 해당 메소드 내용 실행
		// 3. 해당 메소드의 종료후 호출 위치로 돌아온다
		mem.test();
		System.out.println("main 종료");
		
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;
		System.out.print("수 입력 : ");
		num1 =input.nextInt();
		System.out.print("수 입력 : ");
		num2 =input.nextInt();
		// 인자값(파라미터)
		sum = mem.sumFunc(num1 , num2);
		System.out.println("두 수의 합 : "+sum);
	}
}

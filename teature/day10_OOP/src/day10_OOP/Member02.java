package day10_OOP;

import java.util.Scanner;

public class Member02 {
//public : 외부의 접근 가능
// void : 반환타입지정(int, String,,등등)
// test : method 이름(사용자가 지정하고 싶은 것)
// method 이름 규칙 : 첫번째 글자는 소문자이며 합성어의 첫 글자는 대문자
	public void test() {
		System.out.println("test 기능 입니다!!!");
	}
				// 매개변수(아규먼트)
	public int sumFunc(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	public void sumFunc() {
		Scanner input = new Scanner(System.in); 
		int num ,su;
		System.out.print("수 입력 : ");
		num=input.nextInt();
		System.out.print("수 입력 : ");
		su = input.nextInt();
		System.out.print("두 수의 합 : "+(num+su));
	}

}














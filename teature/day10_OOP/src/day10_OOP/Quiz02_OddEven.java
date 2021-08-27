package day10_OOP;

import java.util.Scanner;

public class Quiz02_OddEven {
	public void inputNum() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		//String s = oddEven(num);
		int s = oddEven(num);
		print(s);
	}
	public int oddEven(int num) {
		if(num % 2 == 0) {
			//return "입력 값은 짝수 입니다";
			return 0;
		}else {
			//return "입력 값은 홀수 입니다";
			return 1;
		}
	}
	public void print(int s) {
		if(s == 0) {
			System.out.println("입력 값은 짝 수 입니다");
		}else {
			System.out.println("입력 값은 홀 수 입니다");
		}
	}
}








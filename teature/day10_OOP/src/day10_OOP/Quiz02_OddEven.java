package day10_OOP;

import java.util.Scanner;

public class Quiz02_OddEven {
	public void inputNum() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�� �Է�");
		num = input.nextInt();
		//String s = oddEven(num);
		int s = oddEven(num);
		print(s);
	}
	public int oddEven(int num) {
		if(num % 2 == 0) {
			//return "�Է� ���� ¦�� �Դϴ�";
			return 0;
		}else {
			//return "�Է� ���� Ȧ�� �Դϴ�";
			return 1;
		}
	}
	public void print(int s) {
		if(s == 0) {
			System.out.println("�Է� ���� ¦ �� �Դϴ�");
		}else {
			System.out.println("�Է� ���� Ȧ �� �Դϴ�");
		}
	}
}








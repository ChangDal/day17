package day10_OOP;

import java.util.Scanner;


public class Quiz03_Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		Quiz03_3의배수 quiz03 = new Quiz03_3의배수();
		boolean bool = quiz03.op(num);
		quiz03.print(bool);
	}
}

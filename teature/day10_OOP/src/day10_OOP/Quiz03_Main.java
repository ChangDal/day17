package day10_OOP;

import java.util.Scanner;


public class Quiz03_Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�� �Է�");
		num = input.nextInt();
		Quiz03_3�ǹ�� quiz03 = new Quiz03_3�ǹ��();
		boolean bool = quiz03.op(num);
		quiz03.print(bool);
	}
}

package day10_OOP;

import java.util.Scanner;

public class Quiz05_���밪 {
	public int input() {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("�� �Է�");
		num = in.nextInt();
		return num;
	}
	public int abs(int a) {
		if(a < 0) {
			return -a;
		}
		return a;
	}
	public void print(int a, int n) {
		System.out.println(n+"�� ���밪 : "+a);
	}
}





package day03_if;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		if( ( num % 2 ) == 0 ) {
			System.out.println("�Է��� ���� ¦���� : "+num);
		}
		if(num % 2 == 1 ) {
			System.out.println("�Է��� ���� Ȧ���� : "+num);
		}
	}
}




package day05_switch_for;

import java.util.Scanner;

public class Ex01_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("�� �Է�");
		select = input.nextInt();
		switch(select) {
			case 2: System.out.println("2�Է� : "+select);break;
			case 3: System.out.println("3�Է� : "+select);break;
			case 1: 
				System.out.println("1�Է� : "+select);
				System.out.println("1�Է� : "+select);
				System.out.println("1�Է� : "+select);
				System.out.println("1�Է� : "+select);
				break;
			default:System.out.println("1~3���� �� �Է�");
		}
		System.out.println("���� ����� ����");
	}
}





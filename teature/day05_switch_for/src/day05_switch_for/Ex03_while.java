package day05_switch_for;

import java.util.Scanner;

public class Ex03_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		while(true) 
		{
			System.out.println("�̸� �Է�");
			System.out.print(">>>> : ");
			name = input.next();
			System.out.println("����� �̸��� "+name+" �̱���");
			System.out.println("==========================");
		}
	}
}

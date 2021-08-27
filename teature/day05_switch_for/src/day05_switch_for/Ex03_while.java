package day05_switch_for;

import java.util.Scanner;

public class Ex03_while {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		while(true) 
		{
			System.out.println("이름 입력");
			System.out.print(">>>> : ");
			name = input.next();
			System.out.println("당신의 이름은 "+name+" 이군요");
			System.out.println("==========================");
		}
	}
}

package day12;

import java.util.Scanner;

public class Variable06 {
	int age;
	String name;
	public void display() {
		System.out.println("�л� �̸� :"+name);
		System.out.println("�л� �̸� :"+age);
		
	}
	
	public void InputNum() {
		Scanner input = new Scanner(System.in);
	
		System.out.println("�л� �̸� �Է�");
		name = input.next();
		System.out.println("�л� ���� �Է�");
		age = input.nextInt();
	}
}

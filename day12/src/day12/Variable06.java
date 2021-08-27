package day12;

import java.util.Scanner;

public class Variable06 {
	int age;
	String name;
	public void display() {
		System.out.println("학생 이름 :"+name);
		System.out.println("학생 이름 :"+age);
		
	}
	
	public void InputNum() {
		Scanner input = new Scanner(System.in);
	
		System.out.println("학생 이름 입력");
		name = input.next();
		System.out.println("학생 나이 입력");
		age = input.nextInt();
	}
}

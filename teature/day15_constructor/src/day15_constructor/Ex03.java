package day15_constructor;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age=0;
		System.out.println("나이 입력");
		age = input.nextInt();
		Constructor03 con = new Constructor03(age);
		//con.setAge(age);
		System.out.println("당신의 나이는 : "+con.getAge());
	}
}






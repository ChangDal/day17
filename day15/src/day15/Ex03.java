package day15;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age=0;
	System.out.println("���� �Է�");
	age = input.nextInt();
	Constructor03 con = new Constructor03(age);
	System.out.println("����� ���̴� : "+con.getAge());
	//con.setAge(12345);
	
	
}
}

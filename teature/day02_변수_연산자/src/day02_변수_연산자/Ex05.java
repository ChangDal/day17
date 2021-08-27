package day02_변수_연산자;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		String name;
		
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("나이 입력 : ");
		num = input.nextInt();
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+num);
	
	}
}







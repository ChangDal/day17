package day13_this_setget;

import java.util.Scanner;

public class Ex03_Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.print("이름 입력 : "); name = input.next();
		System.out.print("나이 입력 : "); age = input.nextInt();
		/*
		 객세 생성후 setter을 통해 이름과 나이를 객체 멤버 변수에 저장
		 나이를 만으로 계산하는 메소드를 만들어 만으로 age저장
		 저장된 값을 getter을 통해 출력
		 ??? 님의 나이는 ?? 살 입니다
		 */
		Ex03_private ex = new Ex03_private();
		ex.setName(name);
		ex.setAge(age);
		ex.opAge();
		System.out.println("이름 : "+ex.getName());
		System.out.println("나이 : "+ex.getAge());
	}
}











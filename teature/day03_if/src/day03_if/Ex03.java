package day03_if;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 제어문
		 - 프로그램의 흐름을 제어할 수 있다
		 if문
		 */
		 Scanner input = new Scanner(System.in);
		 int num;
		 System.out.println("1. 쉬운게임");
		 System.out.println("2. 어려운 게임");
		 System.out.println("3. 나가기");
		 System.out.print(">>>> : ");
		 num = input.nextInt();
		 if(num == 1) {
			 System.out.println("쉬운 게임을 실행 합니다");
		 }
		 if(num == 2) {
			 System.out.println("어려운 게임을 실행 합니다");
		 }
		 if(num == 3) {
			 System.out.println("게임을 종료 합니다");
		 }
	}
}














package day05_switch_for;

import java.util.Scanner;

public class Ex01_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("수 입력");
		select = input.nextInt();
		switch(select) {
			case 2: System.out.println("2입력 : "+select);break;
			case 3: System.out.println("3입력 : "+select);break;
			case 1: 
				System.out.println("1입력 : "+select);
				System.out.println("1입력 : "+select);
				System.out.println("1입력 : "+select);
				System.out.println("1입력 : "+select);
				break;
			default:System.out.println("1~3외의 값 입력");
		}
		System.out.println("다음 문장들 실행");
	}
}





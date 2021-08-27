package day05_switch_for;

import java.util.Scanner;

public class Quiz02_switch {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String home=null,office=null;
		int num = 0;
		while(true){
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = input.nextInt();
			switch(num){
			case 1: System.out.print("우리집 목적지 입력: ");
			input.nextLine();
			home = input.nextLine();	System.out.println("등록 성공");	break;
			case 2:System.out.print("회사 목적지 입력 : ");
			input.nextLine();
			office = input.nextLine();
			System.out.println("등록 성공");	break;
			case 3:System.out.println("우리집 : "+home);
			System.out.println("회사 : "+office);
			}
		}
	}
}

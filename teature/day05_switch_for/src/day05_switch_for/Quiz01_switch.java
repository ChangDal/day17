package day05_switch_for;

import java.util.Scanner;

public class Quiz01_switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
		System.out.print("날짜 입력 : ");
		num = input.nextInt();
		switch(num%7){
			case 1:System.out.println(num+":월요일");break;
			case 2:System.out.println(num+"화요일");break;
			case 3:System.out.println(num+":수요일");break;
			case 4:System.out.println(num+"목요일");break;
			case 5:System.out.println(num+":금요일");break;
			case 6:System.out.println(num+"토요일");break;
			case 0:System.out.println(num+":일요일");break;
		}

	}
	}
}

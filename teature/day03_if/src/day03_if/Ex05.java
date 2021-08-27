package day03_if;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if( ( num % 2 ) == 0 ) {
			System.out.println("입력한 수는 짝수다 : "+num);
		}
		if(num % 2 == 1 ) {
			System.out.println("입력한 수는 홀수다 : "+num);
		}
	}
}




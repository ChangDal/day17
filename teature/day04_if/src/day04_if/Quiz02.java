package day04_if;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
	/*
	 if, else 문제
	 1. 커피의 개당 가격은 2000원이다. 10개 초과하면 초과하는 양에 대해서만 
	   개당 1500원씩 받는다. 커피의 개수를 입력 받아 금액을 출력하시오.
	   */
		/*
		Scanner input = new Scanner(System.in);
		int num=0, result = 20000, total=0;
		System.out.print("커피 개수 입력 : ");
		num = input.nextInt();
		if(num >10) {
			total = result + (num-10)*1500;
		}else {
			total = num * 2000;
		}
		System.out.println(num+"개의 커피 가격 : "+total);
		*/
		/*
	 if, else if, else 문제
	 2. 
	 정수를 입력받아 아래와 같이 출력하시오.
	1) 3의배수이면서,4의배수에도 해당 => [ ]은(는)3의 배수이면서,4의 배수입니다.
	2) 3의배수에만 해당 => [ ]은(는)3의 배수입니다.
	3) 4의배수에만 해당 => [ ]은(는)4의 배수입니다.
	4) 3의배수도,4의배수도 해당안됨 => [ ]은(는)3의배수도 4의배수도 아닙니다.
	5) ( 0 입력시 잘못입력)
	=======>입력받은값에 따라 출력 되게 만드세요.<======
	 */
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if(num == 0) {
			System.out.println("입력 값은 0이다");
		}else if(num%3==0 && num%4==0) {
			System.out.println("3,4의 배수");
		}else if(num%3==0) {
			System.out.println("3의 배수");
		}else if(num%4==0) {
			System.out.println("4의 배수");
		}else if(num%3 != 0 || num%4 != 0) {
			System.out.println("3,4의 배수가 아니다");
		}
	}
}
















package day04_if;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//입력한 데이터가 3의 배수인 경우 출력하시오
		/*
		int num;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if(num%3 == 0) {
			System.out.println("입력한 수는 3의 배수 : "+num);
		}
		*/
		//입력한 수의 절대값을 구하는 프로그램을 작성하시오
		/*
		int abs;
		System.out.print("수 입력 : ");
		abs = input.nextInt();
		if(abs < 0) {
											// abs * -1
			System.out.println(abs+"의 절대값 : "+ -abs);
		}
		if(abs > 0) {
			System.out.println(abs+"의 절대값 : "+abs);
		}
		*/
		//두수를 입력 받아 큰 수를 출력 하시오
		/*
		int num1, num2;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		System.out.print("수 입력 : ");
		num2 = input.nextInt();
		if(num1 > num2) {
			System.out.println(num1+"과"+num2+"중 큰 수 : "+num1);
		}
		if(num2 > num1) {
			System.out.println(num1+"과"+num2+"중 큰 수 : "+num2);
		}
		*/
		//세수를 입력 받아 큰 수를 출력 하시오
		/*
		 int number1=0, number2=0, number3=0, maxNumber=0;
		 
		
		System.out.println("1.수 입력 : ");
		number1 = input.nextInt();
		System.out.println("2.수 입력 : ");
		number2 = input.nextInt();
		System.out.println("3.수 입력 : ");
		number3 = input.nextInt();
		if(number1 > number2) {
			maxNumber = number1;
		}
		if(number2 > number1) {
			maxNumber = number2;
		}
		if(number3 > maxNumber) {
			maxNumber = number3;
		}
		System.out.println("가장 큰 수 : "+maxNumber);
		*/
		
		//두수를 입력 받아 큰 수가 짝수이면 출력하시오
		/*
		int su1=0, su2=0;
		System.out.println("1.수 입력 : ");
		su1 = input.nextInt();
		System.out.println("2.수 입력 : ");
		su2 = input.nextInt();
		if(su1 > su2 && su1 % 2 == 0) {
			System.out.println("su1이 크면서 짝수다 : "+su1);
		}
		if(su2 > su1 && su2 % 2 == 0) {
			System.out.println("su2이 크면서 짝수다 : "+su2);
		}
		*/
		//두수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력하시오
		int n1=0, n2=0, sum=0;
		System.out.println("두 수 입력 : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		sum = n1+n2;
		if(sum % 6 == 0) {// sum % 2 == 0 && sum % 3 == 0
			System.out.println("짝수이며 3의 배수다");
		}
	}
}











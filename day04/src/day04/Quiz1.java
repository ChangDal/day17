package day04;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int coffee = 2000; int num = 0; int hap=20000;
	
	System.out.println("커피의 개수를 입력하세요 : ");
	num = input.nextInt();
	
	if(num>10)
	{
	    coffee=1500;
		System.out.println("커피의 가격은 다음과 같습니다: "+(hap+((num-10)*coffee)));
	}

	else if(num < 10) 
	{
		System.out.println("커피의 가격은 다음과 같습니다: "+num*coffee);
	}
	
	 int number = 0;
	 
	 System.out.println("수를 입력하세요 : ");
	 number = input.nextInt();
	 
	 if(number == 0)
	 {
		 System.out.println("잘못 입력하셨습니다");
	 }
	 else if(number%12 == 0)
	 {
		 System.out.println(number+" 는 3의 배수이면서, 4의 배수입니다");
	 }
	 
	 else if(number%3 ==0)
	 {
		 System.out.println(number+"는 3의 배수입니다");
	 }
	 else if(number%4 ==0)
	 {
		 System.out.println(number+"는 4의 배수입니다");
     }

	 else
	 {
		 System.out.println(number+"는 3의배수도 4의 배수도 아닙니다");
	 }

}
}

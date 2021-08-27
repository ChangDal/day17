package day05;

import java.util.Scanner;

public class Team2 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
		//두개의 주사위를 던졌을 때 주사위의 합의 6이 되는 경우의 수를 출력하시오  
			
	int i =0, j=0;
	int sum=0;
	for(i = 1; i <= 6; i++)
	{
		
		for(j = 1; j <= 6; j++)
		{
			if(i+j==6)
			{
				sum= sum+1;
			}
		}
	}
	System.out.println("주사위의 경우의수는"+sum);

	//1~100 중에서 2의 배수이면서 3의 배수의 개수를 구하시오
	sum = 0;
	for(i=1; i<=100; i++)
	{
		if(i%2 == 0 && i%3 == 0)
		{
			sum= sum+1;
		}
	
	}
	
	System.out.println("1에서 100사이의 2의배수이면서 3의배수의 개수는 "+ sum);
	
	//  1 부터 100 까지의 정수 중에서 짝수들의 합을 계산하여 결과값을 출력하는 프로그램을 구현한다.
    //- 단, 조건문은 사용하지 않도록 하며, while 반복문을 사용하여 작성할 수 있도록 한다.
	
	i= 0;
	sum = 0;
	while(i < 100)
	{
		i= i+2;
		
		sum= sum+i;
	}
	System.out.println("짝수들의 합은"+sum);
	
	//for문을 이용하여 24시간을  표시 하시오  - 23시 59분 59초 까지 출력이 나오도록 
	
	for(i =1; i<=24; i++)
	{
		for(j=0;j<=59;j++)
		{
			System.out.println("시간표시"+i+"시간"+j+"분"+j+"초");
		}
	}
	
	//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
	sum=0;
	for(i = 1; i<= 20; i++)
	{
		for(j=1; j<=i; j++)
		{
			sum=sum+j;
		}
	}
	System.out.println(sum);
	
	
	
}
}

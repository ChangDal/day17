package day05;

import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	
	int i;
	int saving=1;
	
	for(i = 1; i <= 30; i++)
	{
	 saving = i*2;
	 
	 if (i == 30)
	 {
		 System.out.println(saving);
	 }
	
	}
	
	System.out.println();
	
;
	int sum= 0;
	for(i = 1; i<=1000; i++)
	{
		
		if(i%3==0 && i%5 ==0)
		{
		
		}
		
		else if(i%3== 0)
		{
			continue;
		}
		sum= sum+i;	
	}
	System.out.println(sum);
	
	System.out.println();
	
	int max = 0;
	
	for(i = 1; max<10000 ; i++)
	{
		if(i%2 != 0)
		{
			max = max+i;
			if(max+i>=10000)
			{
				System.out.println(i);
			}
			//max는 10000까지
		}
	}
	
	
	System.out.println();
	
	
	int totalRice = 100000;
	int mouse = 2;
	int oneDayRice = 20;
	//1kg = 1000g 40g 1day  10day 400  25일이면 쌀한통을 먹네
	
	for(i = 1; totalRice >= 0; i++)
	{
		totalRice = totalRice-(oneDayRice*mouse);
		
		if(i%10 == 0)
		{
			mouse = mouse*2;
			
			
		}
		if(totalRice<=0)
		{
			break;
		}
		
		
	}
	
	System.out.println("쥐의수는 "+mouse+ "쌀은언제끝나나"+ i);
	
	
	int num1= 0, num2=0;
	int numMax=0, numMin=0;
	int coomonMaxNum = 0, coomonMinNum = 0;
	System.out.println("두 수를 입력하세요 :");
	num1 = input.nextInt();
	num2 = input.nextInt();
	// 두 수의 가장 작은 공통된 배수 최소공배수
	// 두 수를 나눌수있는 가장 큰 수 최대공약수
	
	if(num1>=num2)
	{
		numMax = num1;
		numMin = num2;
	}
	else
	{
		numMax = num2;
		numMin = num1;
	}
	
	for(i=1; i<=10000;i++)
	{
		
		
		if(numMax*i%numMin==0)
		{
			coomonMaxNum= numMax*i;
			break;
		}
		
		
	}
	
	for (i=0; i<=10000; i++)
	{
	        if (numMax % (numMin - i) == 0 && numMin % (numMin - i) == 0)
	        {
	        	coomonMinNum = numMin - i;
	            break;
	        }
	}
	
	System.out.println("최소 공배수는 "+ coomonMaxNum);
	System.out.println("최대 공약수는 "+ coomonMinNum);
	
	
	
	
	
	
}
}

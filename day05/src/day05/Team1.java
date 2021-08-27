package day05;

import java.util.Scanner;

public class Team1 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i=0;
		int n=0;
		int gogodan= 0;
		int num1, num2;
		int j = 0;
		
		// 구구단 출력
		
		System.out.println("숫자를 입력하세요");
		n = input.nextInt();
		
		for(i=1;i<=9; i++)
		{
			gogodan = n*i;
			
			System.out.println(n+"X"+i+" = "+gogodan);
		}
		
		// 두 정수를 입력받아 A+B를 출력
		 
		System.out.println("두 정수를 입력하세요");
		
	
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println(num1 +" + " + num2 + " = "+(num1+num2));
		
		//직각삼각형 왼쪽
		
		System.out.println("출력될 별의 개수를 입력하세요");
		n = input.nextInt();
	
	
		for(i = 1 ; i <= n; i++)
		{
			
			
			
			for(j = 1; j <= n; j++)
			{
			
				System.out.print("*");
				
				if(i==j)
				{
					break;
				}
			}
			
		
		System.out.println();
		}
		
		//직각삼각형 오른쪽
		
		System.out.println("출력될 별의 개수를 입력하세요");
		n = input.nextInt();
		
		  for(i = 1 ; i <= n; i++)
	        {
	            
	            
	            
	            for(j = n-i; j > 0; j--)
	            {
	            
	                
	                System.out.print(" ");
	                
	              
	            }
	           
	            for (j = 1; j <= n; j++) {
	                System.out.print("*");
	                if (i == j) {
	                    break;
	                }
	                
	        
	    
	        
	        }
		        System.out.println();
	           }
	           
		
		// 1~100까지 짝수이면서 5의배수만 출력
		
		int sum = 0;
		for(i = 1; i <=100; i++)
		{
			if(i%2 == 0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	}

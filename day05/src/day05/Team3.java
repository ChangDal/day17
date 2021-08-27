package day05;

import java.util.Scanner;

public class Team3 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int i=0, j=0;
	
	/* 11. (이중 for문) 아래와 같이 출력시키면 ? 
			/*2x1=2     3x1=3     4x1=4      5x1=5 

		2x2=4     3x2=6     4x2=8      5x2=10 

		2x3=6     3x3=9     4x3=12    5x3=15 

		2x4=8     3x4=12    4x4=16     5x4=20 

		2x5=10    3x5=15    4x5=20     5x5=25 

		2x6=12    3x6=18    4x6=24     5x6=30 

		2x7=14    3x7=21    4x7=28     5x7=35 

		2x8=16    3x8=24     4x8=32     5x8=40 

		2x9=18    3x9=27     4x9=36     5x9=45 */
			
	  for ( i = 1; i < 10; i++) {
          System.out.print("2 * " + i + " = " + (i + 1 * i) + "\t");
          System.out.print("3 * " + i + " = " + (i + 2 * i) + "\t");
          System.out.print("4 * " + i + " = " + (i + 3 * i) + "\t");
          System.out.print("5 * " + i + " = " + (i + 4 * i) + "\t");
          System.out.println("");
      }
	
	//12. 1 ~ 100 까지 숫자 중 3과 5의 배수를 출력하고 그 합을 구하시오.
			int sum=0;
			while(i<=100)
			{i+=1;
				if(i%3==0 && i%5==0)
				{
					System.out.println("3과 5의 배수는" +i+"이다");
				 	sum= sum+i;
				 	
				}
			}
			System.out.println("3과 5의배수의 합은 =" +sum);
	//13 다음과 같이 출력하시오
		  /*a 1 2 3 4          
			b c 5 6 7 
			d e f 8 9 
			g h i j 10 */
			
			char askiStr = 97;
			char askiNum = 49;
			for(i=0; i<4; i++)
			{
				for(j=0; j<=4; j++)
				{
					if(j>i)
					{
					
						if(askiNum == 58)
						{
							System.out.print(10);
							continue;
						}
						System.out.print(askiNum);
						askiNum =(char)(askiNum+1);
						
					}
					else
					{
						System.out.print(askiStr);
						askiStr =(char)(askiStr+1);
					}
				
					
					
					
				
				}
				System.out.println();
			}
	//14. 정수를 입력받고  1부터 입력된 수만큼 1씩 증가시키며 별을 찍고,   다시 1까지 감소시키는 출력문을 만들어라	
			
		 int number = 0;
		 System.out.println("정수 입력");
		 number = input.nextInt();
		 
		 for(i=1; i<=number; i++)
		 {
			 for(j=1; j<=i; j++)
			 {
				 if(j>i)
				 {
					 System.out.print(" ");
					 
				 }
				 else
				 {
					 System.out.print("*");
				 }
			 }
			 
			
			 System.out.println();
		 }
		 for(int c=number-1; c>0; c--)
		 {
			 for(int d=c; d>0; d--)
			 {
				  if(d<number)
	                 {   
	                  
	                  System.out.print("*");
	                  
	                 }
				
			 }
			 
			 System.out.println();
		 }
			//15.1~1000까지의 합을 구하시오.
			//(단, 3의 배수는 제외하고 3의 배수이면서 5의배수는 제외하지않는 조건으로 구하시오.)
			sum=0;
			for(i= 1; i<=1000; i++)
			{
				
				if(i%3==0 && i%5==0)
				{
					sum=sum+i;
				}
				else if(i%3==0)
				{
					continue;
				}
				else
				{
					sum=sum+i;
				}
				
			}
			System.out.println("1~1000까지의 합 단 3의배수는 제외 3의배수 5의배수합은포함 ="+sum);
		
			
}
}

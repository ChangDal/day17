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
		
		// ������ ���
		
		System.out.println("���ڸ� �Է��ϼ���");
		n = input.nextInt();
		
		for(i=1;i<=9; i++)
		{
			gogodan = n*i;
			
			System.out.println(n+"X"+i+" = "+gogodan);
		}
		
		// �� ������ �Է¹޾� A+B�� ���
		 
		System.out.println("�� ������ �Է��ϼ���");
		
	
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println(num1 +" + " + num2 + " = "+(num1+num2));
		
		//�����ﰢ�� ����
		
		System.out.println("��µ� ���� ������ �Է��ϼ���");
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
		
		//�����ﰢ�� ������
		
		System.out.println("��µ� ���� ������ �Է��ϼ���");
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
	           
		
		// 1~100���� ¦���̸鼭 5�ǹ���� ���
		
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

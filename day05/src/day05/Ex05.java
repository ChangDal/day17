package day05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("����⹮��");
		
		
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=5; j++)
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
		
		System.out.print("����� ���� �ݴ��");
		
		for(int i =0; i<=5; i++)
		{
			for(int j=5; j>0; j--)
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
	}
}

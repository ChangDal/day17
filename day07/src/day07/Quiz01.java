package day07;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int sum = 0;
	int sum2 = 0;
	int num= 1;
	int num2= 1;

	
	
	
	while(true)
	{
		System.out.println("1~10���� ���� �Է�");
		num = input.nextInt();
		
		if(num<1 || num>=11)
		{
			System.out.println("�ٽ� �Է��ϼ���");
		
			continue;
			
		
		}	
		System.out.println("10~20���� ���� �Է�");
		num2 = input.nextInt();
		if(num2>=10 && num2<= 20)
		{
			break;
		}	
		else
		{
			System.out.println("ó������ �ٽ� �Է��ϼ���");
			
			continue;
		}
		
	}
	for(int i= 1; i<=num; i++)
	{
	 sum+=i;
	 
	}
	for(int j= 1; j<=num2; j++)
	{
	 sum2+=j;
	}
	System.out.println("1~10���� ��������"+sum);
	System.out.println("10~20���� ��������"+sum2);
	
	
}
}
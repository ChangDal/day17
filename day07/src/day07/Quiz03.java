package day07;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
	
		int money = 0;
		int select = 0;
	System.out.print("����� ���� �ϼ��� >>>");
	 money = input.nextInt();
	
	while(true)
	{
		System.out.println("1. Ŀ��(200) 2. ���ھ�(250) 3. ��ȯ 4. ����");
		
		System.out.print("�޴��� �����ϼ��� >>>");
		 select = input.nextInt();
		
		if(select < 1 || select > 4)
		{
			System.out.println("���� ���Է�");
			continue;
		}
		
		switch(select) 
		{
		case 1:
		 
		if(money >= 200)
		{
			System.out.println("���ְ� �弼��");
			money = money - 200;	
			break;
		}
		else if(money < 200)
		{
			System.out.println("����� �����մϴ�");
			break;
		}
		 
		case 2:
			 if(money >= 250)
			{
				 System.out.println("���ְ� �弼��");
					money = money - 250;	
					break;
			}
			else if(money < 250)
			{
				System.out.println("����� �����մϴ�");
				break;
			}
		
		case 3:
			System.out.println("�Ž����� : "+ money);
			money = 0;
			break;
		case 4:
			System.exit(select);
			
	}
	}
	
	}	
}
package team_learn;

import java.util.Scanner;

public class Quiz04_funtion {
int select = 0;
int temperature = 25;
	Scanner input = new Scanner(System.in);
	public void airCon_Wind_Adj()
	{
		System.out.println("1.����ǳ�� 2.�¿�ǳ��");
	
		select = input.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("����ǳ������ �����մϴ�");
		break;
		
		case 2:
			System.out.println("�¿�ǳ������ �����մϴ�.");
		break;
		}
		
	}
	
	public void airCon_Temp() {
		System.out.println("��� �µ��� �����ϼ���");
		
		System.out.println("1.�µ��� 2.�µ��� 3.�µ��Է�");
		
		select = input.nextInt();
		switch(select)
		{
		case 1:
			temperature++;
		System.out.println("����µ��� "+ temperature);
			break;
			
		case 2:
			temperature--;
			System.out.println("����µ��� "+ temperature);
			break;
		case 3:
			System.out.println("������ �µ��� �Է��ϼ���");
			temperature = input.nextInt();
			System.out.println("����µ��� "+ temperature);
			break;
		}
	}
}

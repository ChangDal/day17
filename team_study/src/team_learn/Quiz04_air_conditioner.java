package team_learn;

import java.util.Scanner;

public class Quiz04_air_conditioner {
public static void main(String[] args) {
	
	int selecton = 0;
	int select = 0;
	Quiz04_funtion airCon = new Quiz04_funtion();
	
	Scanner input = new Scanner(System.in);
	
	boolean adjust = true;
	System.out.println("1.�����ѱ� 2.�ƹ��͵����ϱ�");
	
	selecton = input.nextInt();
	if(selecton == 1)
	{
		System.out.println("������ �׽��ϴ�");
	}
	else if(selecton == 2)
			{System.out.println("�ƹ��ϵ� �Ͼ�� �ʾҽ��ϴ�");
			}
	
	
	while(adjust && selecton == 1)
	{
		System.out.println("1.ǳ������ 2.�µ����� 3. ��������");
		select = input.nextInt();
		
		switch(select)
		{
		case 1:
		airCon.airCon_Wind_Adj();
		break;
		
		case 2:
		airCon.airCon_Temp();	
		break;
		
		case 3:
		adjust = false;
		System.out.println("������ ���ϴ�");
		}
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
	
}
}
package team_learn;

import java.util.Scanner;

public class Quiz02_Monitor {
public static void main(String[] args) {
	
	Quiz02_funtion monitor = new Quiz02_funtion();
	
	Scanner input = new Scanner(System.in);
	
	int select = 0;
	int selecton = 0;
	boolean adjust = true;
	
	System.out.println("1.���� ON 2.�ƹ��͵� ���Ѵ�");
	selecton = input.nextInt();
	if(selecton == 2)
	{
		System.out.println("�ƹ��͵� ���߳׿� �����ؿ�!");
	}
	else System.out.println("����� ������ �������ϴ�.");
	while(adjust && selecton == 1)
	{
		
		System.out.println("1.�Է� 2.ȭ�� 3.���� 4. ����� ���� OFF");
		select = input.nextInt();
		switch(select)
		{
		case 1:
		monitor.monitorCable();
		break;
		
		case 2:
		monitor.monitorDisplay();
		break;
		
		case 3:
		monitor.monitorVolume();
		break;
		
		case 4:
		adjust = false;
		System.out.println("������ ���ϴ� ");
		break;
		}
		
	}
	
	
	
}




}


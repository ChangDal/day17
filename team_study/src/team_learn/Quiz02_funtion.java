package team_learn;

import java.util.Scanner;

public class Quiz02_funtion 
{
	
private int select = 0;
Scanner input = new Scanner(System.in);
public boolean adjust = true;
int bright = 50, definition = 50;
int Volume = 50;
int cnt = 0;

public void monitorCable()
{
		System.out.println("������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. HDMI 2. DP");
		select = input.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println(" HDMI �� ����Ǿ����ϴ�.");
		break;
		
		case 2:
			System.out.println("DP �� ����Ǿ����ϴ�.");
		break;
		}
			
	

}

public void monitorDisplay()
{
		System.out.println("���� ���: " + bright);
		System.out.println("���� ������: " + definition);
		System.out.println("1.������� 2. ������ ����");
		
		SetSelect(input.nextInt());
		select = GetSelect();
		
		switch(select)
		{
		case 1: 
		System.out.println("������ ���� �Է��ϼ���");
		bright = input.nextInt();
		System.out.println("���� ��� : "+ bright);
		break;
		
		case 2: 
		System.out.println("������ ���� �Է��ϼ���");
		definition = input.nextInt();
		
		System.out.println("���� ������ : "+ definition);
		break;
		}
		

}

public void monitorVolume(){
	
	System.out.println("���� ����" + Volume);
	
	System.out.println("1.�������� 2.���Ұ�");
	select = input.nextInt();
	
	switch(select)
	{
	case 1:
		System.out.println("������ ���� �Է��ϼ���");
		Volume = input.nextInt();
		System.out.println("���纼���� " + Volume);
	break;
	
	case 2:
	cnt ++;
	
	if(cnt%2 == 1)
	{
		System.out.println("���� ���Ұ� �����Դϴ�");
	}
	else 
	{
		System.out.println("���Ұ� ����");
	}
	break;
	}
}
	

	public void SetSelect(int select) {this.select = select;}
	
	public int GetSelect(){return this.select;}
}

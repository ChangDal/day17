package team_learn;

import java.util.Scanner;

public class Quiz05_funtion {
Scanner input = new Scanner(System.in);
int power = 0;
int select = 0;
	public void fanPower() {

		SetPower(input.nextInt());
		
		if(power == 1)
		{
			System.out.println("��ǳ�� ���� on");
		}
		else if(power == 2)
		{
			System.out.println("���� off");
		}
		
	}
	
	public void fan_Wind_adj() 
	
	{
		
		select = input.nextInt();
		switch(select)
		{
		case 1:
			System.out.println("��ǳ�⸦ �����մϴ�");
			break;
		case 2:
			System.out.println("��ǳ���� �����մϴ�");
			break;
		case 3:
			System.out.println("��ǳ���� �����մϴ�.");
			break;
		case 4:
			System.out.println("��ǳ���� �����մϴ�.");
			break;
			
		}
	}
	
	public void fan_spin() {
		select = input.nextInt();
		
		if(select == 1)
		{
			System.out.println("����ȸ�� �մϴ�");
		}
		
		else if(select == 2)
		{
			System.out.println("�¿�ȸ�� �մϴ�.");
		}
	}
	
	
	public void SetPower(int power) {
		this.power = power;
	}
	
	public int GetPower() {
		return this.power;
	}
}
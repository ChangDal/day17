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
			System.out.println("선풍기 전원 on");
		}
		else if(power == 2)
		{
			System.out.println("전원 off");
		}
		
	}
	
	public void fan_Wind_adj() 
	
	{
		
		select = input.nextInt();
		switch(select)
		{
		case 1:
			System.out.println("선풍기를 정지합니다");
			break;
		case 2:
			System.out.println("미풍으로 변경합니다");
			break;
		case 3:
			System.out.println("약풍으로 변경합니다.");
			break;
		case 4:
			System.out.println("강풍으로 변경합니다.");
			break;
			
		}
	}
	
	public void fan_spin() {
		select = input.nextInt();
		
		if(select == 1)
		{
			System.out.println("상하회전 합니다");
		}
		
		else if(select == 2)
		{
			System.out.println("좌우회전 합니다.");
		}
	}
	
	
	public void SetPower(int power) {
		this.power = power;
	}
	
	public int GetPower() {
		return this.power;
	}
}

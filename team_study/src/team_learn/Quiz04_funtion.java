package team_learn;

import java.util.Scanner;

public class Quiz04_funtion {
int select = 0;
int temperature = 25;
	Scanner input = new Scanner(System.in);
	public void airCon_Wind_Adj()
	{
		System.out.println("1.상하풍향 2.좌우풍향");
	
		select = input.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("상하풍향으로 변경합니다");
		break;
		
		case 2:
			System.out.println("좌우풍향으로 변경합니다.");
		break;
		}
		
	}
	
	public void airCon_Temp() {
		System.out.println("희망 온도를 조절하세요");
		
		System.out.println("1.온도↑ 2.온도↓ 3.온도입력");
		
		select = input.nextInt();
		switch(select)
		{
		case 1:
			temperature++;
		System.out.println("현재온도는 "+ temperature);
			break;
			
		case 2:
			temperature--;
			System.out.println("현재온도는 "+ temperature);
			break;
		case 3:
			System.out.println("변경할 온도를 입력하세요");
			temperature = input.nextInt();
			System.out.println("현재온도는 "+ temperature);
			break;
		}
	}
}

package team_learn;

import java.util.Scanner;

public class Quiz03_funtion {

	Scanner input = new Scanner(System.in);
	int select = 0;
	int humidity = 0;
	
public void humidifier_Power()
{
	select = input.nextInt();
	
	if(select == 1)
	{
		System.out.println("전원 on");
	}
	else if(select == 2)
	{
		System.out.println("전원 off");
	}
}

public void humidifier_Adj()
{
	while(true && select == 1)
	{
		
	
	System.out.println("현재 습도를 입력하세요");
	
	humidity =input.nextInt();
	System.out.println("입력한 습도는 "+humidity);
	if(humidity <= 40)
	{
		System.out.println("3단가습 + 따듯한가습 작동");
	}
	else if(humidity >= 40 && humidity <= 60 )
	{
		System.out.println("2단 가습 + 차가운 가습 작동");
	}
	else if(humidity >= 60 && humidity <= 70)
	{
		System.out.println("1단 가습 + 차가운가습 작동");
	}
	
	}
}
}

package team_learn;

import java.util.Scanner;

public class Quiz04_air_conditioner {
public static void main(String[] args) {
	
	int selecton = 0;
	int select = 0;
	Quiz04_funtion airCon = new Quiz04_funtion();
	
	Scanner input = new Scanner(System.in);
	
	boolean adjust = true;
	System.out.println("1.전원켜기 2.아무것도안하기");
	
	selecton = input.nextInt();
	if(selecton == 1)
	{
		System.out.println("전원을 켰습니다");
	}
	else if(selecton == 2)
			{System.out.println("아무일도 일어나지 않았습니다");
			}
	
	
	while(adjust && selecton == 1)
	{
		System.out.println("1.풍향조절 2.온도조절 3. 전원끄기");
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
		System.out.println("전원을 끕니다");
		}
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
	
}
}

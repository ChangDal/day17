package team_learn;

import java.util.Scanner;

public class Quiz02_Monitor {
public static void main(String[] args) {
	
	Quiz02_funtion monitor = new Quiz02_funtion();
	
	Scanner input = new Scanner(System.in);
	
	int select = 0;
	int selecton = 0;
	boolean adjust = true;
	
	System.out.println("1.전원 ON 2.아무것도 안한다");
	selecton = input.nextInt();
	if(selecton == 2)
	{
		System.out.println("아무것도 안했네요 뭘좀해요!");
	}
	else System.out.println("모니터 전원이 켜졌습니다.");
	while(adjust && selecton == 1)
	{
		
		System.out.println("1.입력 2.화면 3.볼륨 4. 모니터 전원 OFF");
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
		System.out.println("전원을 끕니다 ");
		break;
		}
		
	}
	
	
	
}




}


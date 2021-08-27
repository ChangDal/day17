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
		System.out.println("무엇을 연결하시겠습니까?");
		System.out.println("1. HDMI 2. DP");
		select = input.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println(" HDMI 로 변경되었습니다.");
		break;
		
		case 2:
			System.out.println("DP 로 변경되었습니다.");
		break;
		}
			
	

}

public void monitorDisplay()
{
		System.out.println("현재 밝기: " + bright);
		System.out.println("현재 선명도: " + definition);
		System.out.println("1.밝기조정 2. 선명도 조정");
		
		SetSelect(input.nextInt());
		select = GetSelect();
		
		switch(select)
		{
		case 1: 
		System.out.println("조정할 값을 입력하세요");
		bright = input.nextInt();
		System.out.println("현재 밝기 : "+ bright);
		break;
		
		case 2: 
		System.out.println("조정할 값을 입력하세요");
		definition = input.nextInt();
		
		System.out.println("현재 선명도 : "+ definition);
		break;
		}
		

}

public void monitorVolume(){
	
	System.out.println("현재 볼륨" + Volume);
	
	System.out.println("1.볼륨조정 2.음소거");
	select = input.nextInt();
	
	switch(select)
	{
	case 1:
		System.out.println("조정할 값을 입력하세요");
		Volume = input.nextInt();
		System.out.println("현재볼륨은 " + Volume);
	break;
	
	case 2:
	cnt ++;
	
	if(cnt%2 == 1)
	{
		System.out.println("현재 음소거 상태입니다");
	}
	else 
	{
		System.out.println("음소거 해제");
	}
	break;
	}
}
	

	public void SetSelect(int select) {this.select = select;}
	
	public int GetSelect(){return this.select;}
}


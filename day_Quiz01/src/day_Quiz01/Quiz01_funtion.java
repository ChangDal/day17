package day_Quiz01;

import java.util.Scanner;

public class Quiz01_funtion {

	Scanner input = new Scanner(System.in);
	public boolean adjust;
	

public void remotControl() {
	
	int remot = 0;
	int num = 0;
	
	boolean adjust = true;
	while(adjust)
		
	{

	System.out.println("1.채널 ↑ 2. 채널 ↓ 3.채널입력 4.TV OFF");
	remot = input.nextInt();
	switch(remot)
	{
	case 1:
	num++;
	System.out.println("현재 채널은 : "+num);
	break;
	
	case 2:
	num--;	
	System.out.println("현재 채널은 : "+num);
	break;
	
	case 3:
	System.out.println("변경할 채널을 입력하세요");
	num = input.nextInt();
	System.out.println("현재 채널은 : "+num);
	break;
	
	case 4:
	System.out.println("TV 전원을 끕니다");
	adjust = false;
	}
	
	}
	

	
}

public void SetAdjust(boolean adjust) {this.adjust = adjust;}
public boolean GetAdjust() {return this.adjust;}
	

}

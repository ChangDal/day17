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

	System.out.println("1.ä�� �� 2. ä�� �� 3.ä���Է� 4.TV OFF");
	remot = input.nextInt();
	switch(remot)
	{
	case 1:
	num++;
	System.out.println("���� ä���� : "+num);
	break;
	
	case 2:
	num--;	
	System.out.println("���� ä���� : "+num);
	break;
	
	case 3:
	System.out.println("������ ä���� �Է��ϼ���");
	num = input.nextInt();
	System.out.println("���� ä���� : "+num);
	break;
	
	case 4:
	System.out.println("TV ������ ���ϴ�");
	adjust = false;
	}
	
	}
	

	
}

public void SetAdjust(boolean adjust) {this.adjust = adjust;}
public boolean GetAdjust() {return this.adjust;}
	

}

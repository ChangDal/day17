package team_learn;

import java.util.Scanner;

public class Quiz01_TV {
	
	
public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	
	Quiz01_funtion TV = new Quiz01_funtion();
	
	int select = 0;
	
	boolean adjust = true;

	while(adjust)
	{

	System.out.println("TV�� �����ϼ���");
	System.out.println("1.���� ON 2.���� OFF");
	select = input.nextInt();
	
	switch(select)
	{
	case 1:
		System.out.println("TV ������ �׽��ϴ�");
		TV.remotControl();
		
	case 2:
		System.out.println("TV�� ���� �����մϴ�.");
		adjust = false;
	}
	
	
	}
}
}

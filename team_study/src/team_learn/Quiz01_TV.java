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

	System.out.println("TV를 조정하세요");
	System.out.println("1.전원 ON 2.전원 OFF");
	select = input.nextInt();
	
	switch(select)
	{
	case 1:
		System.out.println("TV 전원을 켰습니다");
		TV.remotControl();
		
	case 2:
		System.out.println("TV를 끄고 공부합니다.");
		adjust = false;
	}
	
	
	}
}
}

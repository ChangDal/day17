package day12;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	
	int select = 0;
	Quiz01_function updown = new Quiz01_function();
	Scanner input =  new Scanner(System.in);
	
	updown.rand();
	while(select != 3)
	{
		System.out.println("===== UP & Down Game =====");
		System.out.println("\t 1.게임시작");
		System.out.println("\t 2.게임전적");
		System.out.println("\t 3.게임종료");
		System.out.println(">>>>");
		
		select = input.nextInt();
		
		switch(select)
		{
		case 1:
		updown.answer();
		updown.recordCompare();
		break;
		case 2:
		updown.MaxRecord();	
		break;
		
			
		}
	}

	

}
}

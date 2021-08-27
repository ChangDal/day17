package day07;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
	
		int money = 0;
		int select = 0;
	System.out.print("요금을 투입 하세요 >>>");
	 money = input.nextInt();
	
	while(true)
	{
		System.out.println("1. 커피(200) 2. 코코아(250) 3. 반환 4. 종료");
		
		System.out.print("메뉴를 선택하세요 >>>");
		 select = input.nextInt();
		
		if(select < 1 || select > 4)
		{
			System.out.println("오류 재입력");
			continue;
		}
		
		switch(select) 
		{
		case 1:
		 
		if(money >= 200)
		{
			System.out.println("맛있게 드세요");
			money = money - 200;	
			break;
		}
		else if(money < 200)
		{
			System.out.println("요금이 부족합니다");
			break;
		}
		 
		case 2:
			 if(money >= 250)
			{
				 System.out.println("맛있게 드세요");
					money = money - 250;	
					break;
			}
			else if(money < 250)
			{
				System.out.println("요금이 부족합니다");
				break;
			}
		
		case 3:
			System.out.println("거스름돈 : "+ money);
			money = 0;
			break;
		case 4:
			System.exit(select);
			
	}
	}
	
	}	
}

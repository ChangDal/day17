package day12;

import java.util.Scanner;

public class Quiz01_function {
	int computerrand = 0;
	int UserNumber = 0 ;
	int cnt = 1;
	int maxcnt = 999;
	 void rand() {
		 computerrand = (int)(Math.random()*100+1);
		
	}
	
	void MaxRecord() {
		if(cnt == 1)
		{
			System.out.println("게임 전적이 없습니다");
			cnt = 1;
		}
		else if(cnt < maxcnt)
		{
		System.out.println("최고기록은 !!!"+cnt);
		cnt = 1;
		}
		
		else 
		{	
			System.out.println("최고기록은 "+maxcnt);
			cnt = 1;
		}
		
		
	}
	
	void answer() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("컴퓨터 숫자 : "+computerrand);
		
		while(true)
		{
			
	
		System.out.println("=== START ===");
		System.out.print("Input Number -->");
		UserNumber = input.nextInt();
		
		
		if(computerrand == UserNumber)
		{
			System.out.println(cnt+"회 만에 맞췄습니다 !!!");
			
			
			if(cnt < maxcnt)
			{
				maxcnt = cnt;
			}
			
			break;
		
		}
		
		else if(UserNumber > computerrand)
		{
			System.out.println("더 낮은 숫자를 입력하세요");
			cnt++;
		}
		else 
		{
			System.out.println("더 높은 숫자를 입력하세요");
			cnt++;
		}
		
		}
	}
	
	void recordCompare() {
		
			if(cnt < maxcnt)
			{
				System.out.println("최고기록을 갱신했습니다!!!");
			}
	}
}

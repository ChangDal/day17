package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Team03 {
public static void main(String[] args) {
	
	int strike = 0,ball=0,out=0;
	
	Team03_baseball baseball = new Team03_baseball();
	
	ArrayList<Integer> aList = new ArrayList<Integer>();
	ArrayList<Integer> aList1 = new ArrayList<Integer>();
	
	
	
	while(strike<3)
	{
		
		aList = baseball.InputNum();
		aList1 = baseball.randCom();
		
		System.out.println("사용자가 입력한 숫자는"+aList);
		
		System.out.println("컴퓨터가 입력한 숫자는"+baseball.randCom());
		
		
		for(int i = 0; i<3; i++)
		{
		
			if (strike == 3)
			{
				break;
			}
			else if(aList.get(i) == aList1.get(i))
			{
				System.out.println("스트라이크!");
				strike++;
				
			}
			
		    else if(aList1.contains(aList.get(i)))
			{
				System.out.println("볼입니다~");
				ball++;
				
			}
		    else if(!aList1.contains(aList.get(i))) {
				System.out.println("아웃입니다");
			
			}
			
		
		}
		
		System.out.println("현재 스트라이크 = " + strike);
	}
	
	
}
}

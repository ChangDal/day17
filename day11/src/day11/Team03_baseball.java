package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Team03_baseball {

	int num1,num2,num3;
	int strike,out,ball;
	int computer1,computer2,computer3;
	
	ArrayList<Integer> InputNum() {
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("1~9까지의 숫자를 입력하세요");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();
			
			if(num1 == num2 || num1 == num3 || num2 == num3)
			{
				System.out.println("중복된 숫자는 불가능합니다 다시 선택해주세요");
				continue;
			}
			
			else
			{
				break;
			}
			
		}
		
		aList.add(num1);
		aList.add(num2);
		aList.add(num3);
	    
		return aList;
	}
	
	ArrayList<Integer> randCom(){
		
	
	ArrayList<Integer> aList1 = new ArrayList<Integer>();
	
	
	
	while(true)
	{
		
	if(computer1 == computer2 || computer2 == computer3 || computer1 == computer3)
	{
		 computer1 = (int)(Math.random()*9+1);
		 computer2 = (int)(Math.random()*9+1);
		 computer3 = (int)(Math.random()*9+1);
		 
		continue;
	}
	else
	{
		break;
	}
	
	}
	aList1.add(computer1);
	aList1.add(computer2);
	aList1.add(computer3);

	return aList1;
	
	
	}
}

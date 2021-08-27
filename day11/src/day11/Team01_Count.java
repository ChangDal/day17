package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Team01_Count {

	int num1,num2,num3;
	
	 
	 void  InputNum() {
		
		 Scanner input = new Scanner(System.in);
			
			System.out.println("세 수를 입력하세요");
			num1 = input.nextInt();
			num2 = input.nextInt();
			num3 = input.nextInt();

	}
	 
	 
	 ArrayList<Integer>  OutputNum()
	{
		 ArrayList aList = new ArrayList();
		 
		int cnt0=0,cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0,cnt7=0,cnt8=0,cnt9=0;
		String multiply = Integer.toString(num1*num2*num3);
		
		for(int i = 0; i<multiply.length(); i++)
		{
		
			//0번째 숫자가 무엇인지 알아야한다.

			switch(multiply.charAt(i)){
				case '0':
					cnt0++;
					break;
				case '1':
					cnt1++;
					break;
				case '2':
					cnt2++;
					break;
				case '3':
					cnt3++;
					break;
				case '4':
					cnt4++;
					break;
				case '5':
					cnt5++;
					break;
				case '6':
					cnt6++;
					break;
				case '7':
					cnt7++;
					break;
				case '8':
					cnt8++;
					break;
				case '9':
					cnt9++;
					break;
					
				
			}
		
		
			
		}
		
		aList.add("숫자0 은(는)"+cnt0+" 번 사용");
		aList.add("숫자1 은(는)"+cnt1+" 번 사용");
		aList.add("숫자2 은(는)"+cnt2+" 번 사용");
		aList.add("숫자3 은(는)"+cnt3+" 번 사용");
		aList.add("숫자4 은(는)"+cnt4+" 번 사용");
		aList.add("숫자5 은(는)"+cnt5+" 번 사용");
		aList.add("숫자6 은(는)"+cnt6+" 번 사용");
		aList.add("숫자7 은(는)"+cnt7+" 번 사용");
		aList.add("숫자8 은(는)"+cnt8+" 번 사용");
		aList.add("숫자9 은(는)"+cnt9+" 번 사용");
		
		
		
		return aList;
		
	}
}

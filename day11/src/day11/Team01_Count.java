package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Team01_Count {

	int num1,num2,num3;
	
	 
	 void  InputNum() {
		
		 Scanner input = new Scanner(System.in);
			
			System.out.println("�� ���� �Է��ϼ���");
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
		
			//0��° ���ڰ� �������� �˾ƾ��Ѵ�.

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
		
		aList.add("����0 ��(��)"+cnt0+" �� ���");
		aList.add("����1 ��(��)"+cnt1+" �� ���");
		aList.add("����2 ��(��)"+cnt2+" �� ���");
		aList.add("����3 ��(��)"+cnt3+" �� ���");
		aList.add("����4 ��(��)"+cnt4+" �� ���");
		aList.add("����5 ��(��)"+cnt5+" �� ���");
		aList.add("����6 ��(��)"+cnt6+" �� ���");
		aList.add("����7 ��(��)"+cnt7+" �� ���");
		aList.add("����8 ��(��)"+cnt8+" �� ���");
		aList.add("����9 ��(��)"+cnt9+" �� ���");
		
		
		
		return aList;
		
	}
}

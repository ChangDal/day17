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
		
		System.out.println("����ڰ� �Է��� ���ڴ�"+aList);
		
		System.out.println("��ǻ�Ͱ� �Է��� ���ڴ�"+baseball.randCom());
		
		
		for(int i = 0; i<3; i++)
		{
		
			if (strike == 3)
			{
				break;
			}
			else if(aList.get(i) == aList1.get(i))
			{
				System.out.println("��Ʈ����ũ!");
				strike++;
				
			}
			
		    else if(aList1.contains(aList.get(i)))
			{
				System.out.println("���Դϴ�~");
				ball++;
				
			}
		    else if(!aList1.contains(aList.get(i))) {
				System.out.println("�ƿ��Դϴ�");
			
			}
			
		
		}
		
		System.out.println("���� ��Ʈ����ũ = " + strike);
	}
	
	
}
}
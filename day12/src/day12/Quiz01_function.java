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
			System.out.println("���� ������ �����ϴ�");
			cnt = 1;
		}
		else if(cnt < maxcnt)
		{
		System.out.println("�ְ������ !!!"+cnt);
		cnt = 1;
		}
		
		else 
		{	
			System.out.println("�ְ������ "+maxcnt);
			cnt = 1;
		}
		
		
	}
	
	void answer() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("��ǻ�� ���� : "+computerrand);
		
		while(true)
		{
			
	
		System.out.println("=== START ===");
		System.out.print("Input Number -->");
		UserNumber = input.nextInt();
		
		
		if(computerrand == UserNumber)
		{
			System.out.println(cnt+"ȸ ���� ������ϴ� !!!");
			
			
			if(cnt < maxcnt)
			{
				maxcnt = cnt;
			}
			
			break;
		
		}
		
		else if(UserNumber > computerrand)
		{
			System.out.println("�� ���� ���ڸ� �Է��ϼ���");
			cnt++;
		}
		else 
		{
			System.out.println("�� ���� ���ڸ� �Է��ϼ���");
			cnt++;
		}
		
		}
	}
	
	void recordCompare() {
		
			if(cnt < maxcnt)
			{
				System.out.println("�ְ������ �����߽��ϴ�!!!");
			}
	}
}
package team_learn;

import java.util.ArrayList;

import java.util.Scanner;

public class Quiz06_funtion {
	public String ID,PW;
	Quiz06_timer time = new Quiz06_timer();
	Quiz06_win7 win7 = new Quiz06_win7();
	  Scanner sc = new Scanner(System.in);
	  ArrayList<String> alist = new ArrayList<>();
	  
		public void login() {
			
			System.out.print("���̵� �Է� : ");
			String ID = sc.next();
			
			System.out.print("��й�ȣ �Է� : ");
			String PW = sc.next();
			
		
			
			if (alist.isEmpty())
			{
				System.out.println("���� ���� ����");
			}
			
			else if (alist.contains(ID))
			{
				
				if(alist.get((alist.indexOf(ID)+1)).equals(PW))
				{
					System.out.println("�α��� ����");
				
					time.time();
					
					win7.display();
					
				
				
				
				}
				
				else System.out.println("�α��� ����");
			}
			
			else System.out.println("�α��� ����");
			}
		
		
		public void join() {
			
			
			System.out.print("���̵� �Է� : ");
			String ID = sc.next();
			setID(ID);
			alist.add(getID());
			
			System.out.print("��й�ȣ �Է� : ");
			String PW = sc.next();
			setPW(PW);
			alist.add(getPW());
			
			System.out.println("���� ����");
		
		}
		public void setID(String ID){this.ID = ID;}
		public void setPW(String PW){this.PW = PW;}
		
		public String getID(){return this.ID;}
		public String getPW(){return this.PW;}
		
		
		
		
}
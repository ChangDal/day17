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
			
			System.out.print("아이디 입력 : ");
			String ID = sc.next();
			
			System.out.print("비밀번호 입력 : ");
			String PW = sc.next();
			
		
			
			if (alist.isEmpty())
			{
				System.out.println("저장 정보 없음");
			}
			
			else if (alist.contains(ID))
			{
				
				if(alist.get((alist.indexOf(ID)+1)).equals(PW))
				{
					System.out.println("로그인 성공");
				
					time.time();
					
					win7.display();
					
				
				
				
				}
				
				else System.out.println("로그인 실패");
			}
			
			else System.out.println("로그인 실패");
			}
		
		
		public void join() {
			
			
			System.out.print("아이디 입력 : ");
			String ID = sc.next();
			setID(ID);
			alist.add(getID());
			
			System.out.print("비밀번호 입력 : ");
			String PW = sc.next();
			setPW(PW);
			alist.add(getPW());
			
			System.out.println("저장 성공");
		
		}
		public void setID(String ID){this.ID = ID;}
		public void setPW(String PW){this.PW = PW;}
		
		public String getID(){return this.ID;}
		public String getPW(){return this.PW;}
		
		
		
		
}

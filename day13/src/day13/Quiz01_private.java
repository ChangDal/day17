package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01_private {
  private String ID,PW;
  Scanner sc = new Scanner(System.in);
  ArrayList<String> alist = new ArrayList<>();
  
	public void login() {
		
		System.out.print("아이디 입력 : ");
		String ID = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String PW = sc.next();
		
		System.out.println("ID = "+alist.indexOf(ID));
		System.out.println("ID+1 = "+(alist.indexOf(ID)+1));
		System.out.println("PW = "+alist.indexOf(PW));
		
		if (alist.isEmpty())
		{
			System.out.println("저장 정보 없음");
		}
		
		else if (alist.contains(ID))
		{
			
			if(alist.get((alist.indexOf(ID)+1)).equals(PW))
			{
				System.out.println("로그인 성공");
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

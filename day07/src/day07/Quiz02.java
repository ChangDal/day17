package day07;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
	// 1로그인 2 회원가입 3나가기 만들기
	
	String ID=null, PW=null;
	String newID=null, newPW=null;
	
	while(true)
	{
		System.out.println("1.로그인 2. 회원가입 3.나가기 ");
	System.out.println(">>>");
	int select = input.nextInt();

	 if(select < 1 || select >= 4)
	 {
		 System.out.println("오류 다시 입력!");
		 continue;
	 }
	  if(select == 1)
	 {
		 System.out.println("아이디 입력 : ");
		 ID = input.next();
		 System.out.println("비밀번호 입력 : ");
		 PW = input.next();
		 
		 if(ID.equals(newID) == true && PW.equals(newPW) == true)
		 {
			 System.out.println("로그인 성공");
		 }
		 else
		 {
			 System.out.println("인증 실패!");
		 }
		 
		 
	 }
	 
	   if(select == 2)
	 {
		 System.out.println("저장할 아이디 입력 : ");
		 newID = input.next();
		 System.out.println("저장할 비밀번호 입력 : ");
		 newPW = input.next();
	 }
	   if(select == 3)
	 {
		 break;
	 }
	 
	 
		
		
	}
	}
	
}

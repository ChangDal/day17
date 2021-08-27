package day13_this_setget;


import java.util.*;

public class Quiz_Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num=0,result=0; String inputId=null,inputPw=null;
		Quiz_Login lo = new Quiz_Login(); boolean flag=true;
		while(flag){
			System.out.print("1.로그인  2.가 입  3.로그아웃 \n>>>"); num = input.nextInt();
			switch(num){
			case 1:System.out.print("아이디 입력 : ");inputId = input.next();
			System.out.print("비밀번호 입력 : "); inputPw = input.next();
			result = lo.compare(inputId,inputPw);
			if(result == 0) System.out.println("인증 통과");
			else  System.out.println("인증 실패");
			break;
			case 2: System.out.print("가입 id : "); inputId = input.next();
			System.out.print("가입 pw : "); inputPw = input.next();
			lo.setUserId(inputId);
			lo.setUserPw(inputPw);
			System.out.println("저장 완료");
			break;
			case 3:flag=lo.out();System.out.println("종료 합니다");
			}
		}
	}

}


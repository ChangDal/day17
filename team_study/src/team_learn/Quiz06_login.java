package team_learn;

import java.util.ArrayList;
import java.util.Scanner;


public class Quiz06_login {
public static void main(String[] args) {
	
	int select = 0;
	Quiz06_funtion login = new Quiz06_funtion();
	
	Scanner sc = new Scanner(System.in);
	
	while(select != 3)
	{
		System.out.println("1.로그인 2.가 입 3.로그아웃");
		System.out.println(">>>");
		select = sc.nextInt();
	switch(select)
	{
	
	case 1:
		login.login();
		
		
	break;
	case 2:
		login.join();
	break;
	case 3:
	break;
	}
	}
	
}
}

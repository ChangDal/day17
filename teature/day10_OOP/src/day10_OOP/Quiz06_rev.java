package day10_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz06_rev {
	public int input() {
		Scanner input = new Scanner(System.in);
		int su=0;
		System.out.print("수 입력 : ");
		su = input.nextInt();
		return su;
	}
	public String reverse(int su) {
		int temp=0;
		String result="";
		while(true) {
			temp = su%10;
			su = su/10;
			result += temp;
			if(su == 0) 
				return result;
		}
	}
	public void print(int su,String result) {
		System.out.println(su+" 거꾸로 수 : "+result);
	}
	
	public String reverse02(int su) {
		return su+"";
	}
	public void print02(int su,String result) {
		int end = result.length(); //"123"
		System.out.print(su+"의 거꾸로 수 : ");
		for(int i=0; i< result.length();i++) {
			System.out.print(result.charAt(--end));
		}
	}
	
	
	
}







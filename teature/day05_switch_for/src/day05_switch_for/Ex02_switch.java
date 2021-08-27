package day05_switch_for;

import java.io.IOException;
import java.util.Scanner;

public class Ex02_switch {
	public static void main(String[] args) throws IOException {
		int num;
		System.out.println("문자 하나 입력");
		num = System.in.read();
		switch(num) {
			case 'a':System.out.println("a입력 ");break;
			case 'A':System.out.println("A입력 ");break;
		}
		
		String s = "안녕하세요";
		switch(s) {
			case "안녕하세요" : System.out.println("입력");//문자열도 비교가능하다
		}
		/*
		 // 실수 값은 비교 불가능 
		double d = 1.111;
		switch(d) {
			case 1.111: System.out.println("실수");
		}
		*/
	}
}





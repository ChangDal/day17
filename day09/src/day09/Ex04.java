package day09;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args)
{
	String str = new String("test");
	System.out.println(str);
	
	Scanner input = new Scanner(System.in);
	System.out.println("문자열 입력 : ");
	str = input.next();
	System.err.println("수정 str: "+str);

	
}
}

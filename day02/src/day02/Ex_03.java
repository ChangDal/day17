package day02;

import java.io.IOException;

public class Ex_03 {
public static void main(String[] args) throws IOException
{
	char val;
	int val01;
	
	System.out.println("문자 입력 : ");
	val =  (char)System.in.read();
	System.out.println("==== 출 력 ====");
	System.out.println("입력하신 문자 : "+ val);
	
	val01 = (int)val+32; 

	
	System.out.println("소문자로 변환 : "+ (char)val01);
	//아스키코드 A는65 0X41 a는 97 0X61 
	
}
}


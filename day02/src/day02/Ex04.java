package day02;

import java.io.IOException;

public class Ex04 {
public static void main(String[] args) throws IOException
{
	char val;
	System.out.println("값 입력 : ");
	val = (char) System.in.read();
	System.out.println("==== 출 력 ====");
	System.out.println("입력하신 값 : "+val);
	System.out.println("변환 후 값 : "+ (int)val);
	
}
}

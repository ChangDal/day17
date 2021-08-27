package day09;

public class Ex06 {
public static void main(String[] args)
{
	String str = "abcdefg";
	System.out.println("길이 : "+ str.length());
	System.out.println("인덱스 값(1) : "+str.charAt(1));
	
	String addStr;
	addStr = "a";
	System.out.println("기본 값 : "+addStr);
	addStr += "b";
	System.out.println("문자열 더하기"+addStr);
	
	Integer num=123;
	System.out.println( num.getClass()) ;
	// int형태의 값을 문자열로 변환
	
	
	String s = num+"";
	System.out.println(s);
	
	// 문자열 숫자를 int형태로 변환
	num = Integer.parseInt(s); 
	// 문자열에있는 값을 int 형태로변환 숫자만가능
	
	System.out.println(str.charAt(1) == 'b');
	System.out.println(str.charAt(1) == 'a');
	System.out.println(str.charAt(1)-32 );
	System.out.println( (char)(str.charAt(1)-32) );
	// 소문자 -32 하면 대문자나옴  대문자가 +32 하면 소문자
	
	
	
}	
}

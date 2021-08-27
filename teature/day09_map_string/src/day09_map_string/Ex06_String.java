package day09_map_string;

public class Ex06_String {
	public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println("길이 : " + str.length() );
		System.out.println("인덱스 값(1) : "+ str.charAt(1) );
		
		String addStr;
		addStr = "a";
		System.out.println("기본 값 : "+addStr);
		addStr += "b";
		System.out.println("문자열 더하기 : "+addStr);
		
		Integer num=123; //int
		System.out.println( num.getClass() );
		// int형태의 값을 문자열로 변환
		String s = num+"";
		System.out.println(s);
		// 문자열 숫자를 int형태로 변환
		num = Integer.parseInt( s ) ;
		
		System.out.println(str.charAt(1) == 'b');
		System.out.println(str.charAt(1) == 'a');
		System.out.println(str.charAt(1) - 32);
		System.out.println( (char)(str.charAt(1) - 32) );
	}
}









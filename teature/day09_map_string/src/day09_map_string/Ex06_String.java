package day09_map_string;

public class Ex06_String {
	public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println("���� : " + str.length() );
		System.out.println("�ε��� ��(1) : "+ str.charAt(1) );
		
		String addStr;
		addStr = "a";
		System.out.println("�⺻ �� : "+addStr);
		addStr += "b";
		System.out.println("���ڿ� ���ϱ� : "+addStr);
		
		Integer num=123; //int
		System.out.println( num.getClass() );
		// int������ ���� ���ڿ��� ��ȯ
		String s = num+"";
		System.out.println(s);
		// ���ڿ� ���ڸ� int���·� ��ȯ
		num = Integer.parseInt( s ) ;
		
		System.out.println(str.charAt(1) == 'b');
		System.out.println(str.charAt(1) == 'a');
		System.out.println(str.charAt(1) - 32);
		System.out.println( (char)(str.charAt(1) - 32) );
	}
}









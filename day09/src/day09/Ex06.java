package day09;

public class Ex06 {
public static void main(String[] args)
{
	String str = "abcdefg";
	System.out.println("���� : "+ str.length());
	System.out.println("�ε��� ��(1) : "+str.charAt(1));
	
	String addStr;
	addStr = "a";
	System.out.println("�⺻ �� : "+addStr);
	addStr += "b";
	System.out.println("���ڿ� ���ϱ�"+addStr);
	
	Integer num=123;
	System.out.println( num.getClass()) ;
	// int������ ���� ���ڿ��� ��ȯ
	
	
	String s = num+"";
	System.out.println(s);
	
	// ���ڿ� ���ڸ� int���·� ��ȯ
	num = Integer.parseInt(s); 
	// ���ڿ����ִ� ���� int ���·κ�ȯ ���ڸ�����
	
	System.out.println(str.charAt(1) == 'b');
	System.out.println(str.charAt(1) == 'a');
	System.out.println(str.charAt(1)-32 );
	System.out.println( (char)(str.charAt(1)-32) );
	// �ҹ��� -32 �ϸ� �빮�ڳ���  �빮�ڰ� +32 �ϸ� �ҹ���
	
	
	
}	
}

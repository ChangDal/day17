package day09;

public class Ex05 {
public static void main(String[] args)
{
	String str = "Java is Easy. �׸��� programming �Ҹ��ϴ�";
	System.out.println("�⺻ : "+str);
	
	String changeStr = new String();
	
	changeStr = str.toUpperCase();
	
	System.out.println("��ȯ : "+changeStr);
	
	changeStr = str.toLowerCase();
	System.out.println("��ȯ : "+changeStr);
}
}

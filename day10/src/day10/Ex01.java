package day10;



public class Ex01 {
public static void main(String[] args)
{
	
	/*
	 Class
	 - � ������ ���߰� �ִ� Ʋ
	 - ��Ȱ���� ���� �ϴ�
	 - �ϳ��� �ڷ����̴�
	 ��ü(instance)
	 - class�ڷ������� ���� ���� (��ü)
	 
	 */
	
	int age;
	String name;
	String addr;
	
	Member mem = new Member();
	mem.age = 50;
	mem.name = "ȫ�浿";
	mem.addr = "���¥��";
	
	System.out.println(mem.age);
	System.out.println(mem.name);
	System.out.println(mem.addr);
	
	System.out.println(mem);
	
	
	
	
}
}

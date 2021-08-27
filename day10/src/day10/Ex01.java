package day10;



public class Ex01 {
public static void main(String[] args)
{
	
	/*
	 Class
	 - 어떤 형식을 갖추고 있는 틀
	 - 재활용이 용이 하다
	 - 하나의 자료형이다
	 객체(instance)
	 - class자료형으로 만든 변수 (객체)
	 
	 */
	
	int age;
	String name;
	String addr;
	
	Member mem = new Member();
	mem.age = 50;
	mem.name = "홍길동";
	mem.addr = "산골짜기";
	
	System.out.println(mem.age);
	System.out.println(mem.name);
	System.out.println(mem.addr);
	
	System.out.println(mem);
	
	
	
	
}
}

package day10_OOP;

import java.util.ArrayList;

public class Ex01_Class {
	public static void main(String[] args) {
		/*
		 Class
		 - 어떤 형식을 갖추고 있는 틀
		 - 재활용이 용이 하다
		 - 하나의 자료형이다
		 객체(instance)
		 - Class자료형으로 만든 변수
		 */
		//String name, addr, phNum;
		//int age;
		Memeber mem = new Memeber();
		
		mem.age = 50;
		mem.name = "홍길동";
		mem.addr = "산골짜기";
		
		System.out.println("나이 : "+mem.age);
		System.out.println("이름 : "+mem.name);
		System.out.println("주소 : "+mem.addr);
		
		System.out.println(mem);
		ArrayList test;
	}
}










package day10_OOP;

import java.util.ArrayList;

public class Ex01_Class {
	public static void main(String[] args) {
		/*
		 Class
		 - � ������ ���߰� �ִ� Ʋ
		 - ��Ȱ���� ���� �ϴ�
		 - �ϳ��� �ڷ����̴�
		 ��ü(instance)
		 - Class�ڷ������� ���� ����
		 */
		//String name, addr, phNum;
		//int age;
		Memeber mem = new Memeber();
		
		mem.age = 50;
		mem.name = "ȫ�浿";
		mem.addr = "���¥��";
		
		System.out.println("���� : "+mem.age);
		System.out.println("�̸� : "+mem.name);
		System.out.println("�ּ� : "+mem.addr);
		
		System.out.println(mem);
		ArrayList test;
	}
}










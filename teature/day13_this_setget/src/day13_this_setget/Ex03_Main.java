package day13_this_setget;

import java.util.Scanner;

public class Ex03_Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.print("�̸� �Է� : "); name = input.next();
		System.out.print("���� �Է� : "); age = input.nextInt();
		/*
		 ���� ������ setter�� ���� �̸��� ���̸� ��ü ��� ������ ����
		 ���̸� ������ ����ϴ� �޼ҵ带 ����� ������ age����
		 ����� ���� getter�� ���� ���
		 ??? ���� ���̴� ?? �� �Դϴ�
		 */
		Ex03_private ex = new Ex03_private();
		ex.setName(name);
		ex.setAge(age);
		ex.opAge();
		System.out.println("�̸� : "+ex.getName());
		System.out.println("���� : "+ex.getAge());
	}
}











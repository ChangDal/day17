package day10_OOP;

import java.util.Scanner;

public class Ex02_Method {
	public static void main(String[] args) {
		Member02 mem = new Member02();
		// 1. �޼ҵ��� ȣ��
		// 2. �ش� �޼ҵ� ���� ����
		// 3. �ش� �޼ҵ��� ������ ȣ�� ��ġ�� ���ƿ´�
		mem.test();
		System.out.println("main ����");
		
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;
		System.out.print("�� �Է� : ");
		num1 =input.nextInt();
		System.out.print("�� �Է� : ");
		num2 =input.nextInt();
		// ���ڰ�(�Ķ����)
		sum = mem.sumFunc(num1 , num2);
		System.out.println("�� ���� �� : "+sum);
	}
}

package day10;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[]args)
	{
	//1. ����� ȣ��
	//2. �ش� �޼ҵ� ���� ����
	//3. �ش� �޼ҵ��� ���� �� ȣ�� ��ġ�� ���ƿ´�

	
	Member02 mem = new Member02();
	mem.test();
	System.out.println("main ����");
	
	Scanner input = new Scanner(System.in);
	int num1,num2,sum;
	System.out.print("�� �Է� : ");
	num1 = input.nextInt();
	System.out.println("�� �Է� : ");
	num2 = input.nextInt();
	
	sum = mem.sumFunc(num1, num2);
	
	System.out.println("�� ���� �� : "+sum);
	
	}
}

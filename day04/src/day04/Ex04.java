package day04;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args)
{
	/*
	 * if(���ǽ�){}
	 * else if(���ǽ�){}
	 * else if(���ǽ�){}
	 *...
	 *else
	 */
	Scanner input = new Scanner(System.in);
	int num=0;
	System.out.println("�� �Է�: ");
	num = input.nextInt();
	if(num > 100 )
	{
		System.out.println(num+" : 100���� ũ��");
	}else if(num> 50) {
		System.out.println(num+ " 100���� �����鼭 50���� ũ�� ");
	}else {
		System.out.println("50�� ������ ���� ����");
	}
	System.out.println("���� ����� ����!");
}
}

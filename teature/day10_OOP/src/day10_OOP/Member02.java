package day10_OOP;

import java.util.Scanner;

public class Member02 {
//public : �ܺ��� ���� ����
// void : ��ȯŸ������(int, String,,���)
// test : method �̸�(����ڰ� �����ϰ� ���� ��)
// method �̸� ��Ģ : ù��° ���ڴ� �ҹ����̸� �ռ����� ù ���ڴ� �빮��
	public void test() {
		System.out.println("test ��� �Դϴ�!!!");
	}
				// �Ű�����(�ƱԸ�Ʈ)
	public int sumFunc(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	public void sumFunc() {
		Scanner input = new Scanner(System.in); 
		int num ,su;
		System.out.print("�� �Է� : ");
		num=input.nextInt();
		System.out.print("�� �Է� : ");
		su = input.nextInt();
		System.out.print("�� ���� �� : "+(num+su));
	}

}














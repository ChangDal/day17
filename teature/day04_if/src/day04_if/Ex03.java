package day04_if;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
	//���� �Է� �޾� 0���� ũ�� 100���� ������ ����, �ƴϸ� ���������� ���
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.println("�� �Է�");
		num = input.nextInt();
		if(num > 0 && num < 100 ) {
			System.out.println("����");
		}else {
			System.out.println("�ƴϸ� ���������� ���");
		}
	}
}






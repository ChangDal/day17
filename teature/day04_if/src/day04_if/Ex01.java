package day04_if;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
			if : ���� ��� ���ӹ��� ����
			else : if�� ������ ������ ��� ����
			if�� else�� �׻� ¦�� �̷�� �Ѵ�.
			if�� ���ӹ��� ������ else�� �� �� �ִ�
		*/
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.println("�� �Է�");
		num = input.nextInt();
		if(num % 3 == 0) {
			System.out.println("3�� ���");
		}else {
			System.out.println("3�� ��� �ƴ�");
		}
		System.out.println("���� ����� ����~~~");
	}
}










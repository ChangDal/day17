package day03_if;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 ���
		 - ���α׷��� �帧�� ������ �� �ִ�
		 if��
		 */
		 Scanner input = new Scanner(System.in);
		 int num;
		 System.out.println("1. �������");
		 System.out.println("2. ����� ����");
		 System.out.println("3. ������");
		 System.out.print(">>>> : ");
		 num = input.nextInt();
		 if(num == 1) {
			 System.out.println("���� ������ ���� �մϴ�");
		 }
		 if(num == 2) {
			 System.out.println("����� ������ ���� �մϴ�");
		 }
		 if(num == 3) {
			 System.out.println("������ ���� �մϴ�");
		 }
	}
}














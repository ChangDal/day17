package day04_if;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
	/*
	 if, else ����
	 1. Ŀ���� ���� ������ 2000���̴�. 10�� �ʰ��ϸ� �ʰ��ϴ� �翡 ���ؼ��� 
	   ���� 1500���� �޴´�. Ŀ���� ������ �Է� �޾� �ݾ��� ����Ͻÿ�.
	   */
		/*
		Scanner input = new Scanner(System.in);
		int num=0, result = 20000, total=0;
		System.out.print("Ŀ�� ���� �Է� : ");
		num = input.nextInt();
		if(num >10) {
			total = result + (num-10)*1500;
		}else {
			total = num * 2000;
		}
		System.out.println(num+"���� Ŀ�� ���� : "+total);
		*/
		/*
	 if, else if, else ����
	 2. 
	 ������ �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
	1) 3�ǹ���̸鼭,4�ǹ������ �ش� => [ ]��(��)3�� ����̸鼭,4�� ����Դϴ�.
	2) 3�ǹ������ �ش� => [ ]��(��)3�� ����Դϴ�.
	3) 4�ǹ������ �ش� => [ ]��(��)4�� ����Դϴ�.
	4) 3�ǹ����,4�ǹ���� �ش�ȵ� => [ ]��(��)3�ǹ���� 4�ǹ���� �ƴմϴ�.
	5) ( 0 �Է½� �߸��Է�)
	=======>�Է¹������� ���� ��� �ǰ� ���弼��.<======
	 */
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		if(num == 0) {
			System.out.println("�Է� ���� 0�̴�");
		}else if(num%3==0 && num%4==0) {
			System.out.println("3,4�� ���");
		}else if(num%3==0) {
			System.out.println("3�� ���");
		}else if(num%4==0) {
			System.out.println("4�� ���");
		}else if(num%3 != 0 || num%4 != 0) {
			System.out.println("3,4�� ����� �ƴϴ�");
		}
	}
}
















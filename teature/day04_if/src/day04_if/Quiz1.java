package day04_if;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//�Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�
		/*
		int num;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		if(num%3 == 0) {
			System.out.println("�Է��� ���� 3�� ��� : "+num);
		}
		*/
		//�Է��� ���� ���밪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		/*
		int abs;
		System.out.print("�� �Է� : ");
		abs = input.nextInt();
		if(abs < 0) {
											// abs * -1
			System.out.println(abs+"�� ���밪 : "+ -abs);
		}
		if(abs > 0) {
			System.out.println(abs+"�� ���밪 : "+abs);
		}
		*/
		//�μ��� �Է� �޾� ū ���� ��� �Ͻÿ�
		/*
		int num1, num2;
		System.out.print("�� �Է� : ");
		num1 = input.nextInt();
		System.out.print("�� �Է� : ");
		num2 = input.nextInt();
		if(num1 > num2) {
			System.out.println(num1+"��"+num2+"�� ū �� : "+num1);
		}
		if(num2 > num1) {
			System.out.println(num1+"��"+num2+"�� ū �� : "+num2);
		}
		*/
		//������ �Է� �޾� ū ���� ��� �Ͻÿ�
		/*
		 int number1=0, number2=0, number3=0, maxNumber=0;
		 
		
		System.out.println("1.�� �Է� : ");
		number1 = input.nextInt();
		System.out.println("2.�� �Է� : ");
		number2 = input.nextInt();
		System.out.println("3.�� �Է� : ");
		number3 = input.nextInt();
		if(number1 > number2) {
			maxNumber = number1;
		}
		if(number2 > number1) {
			maxNumber = number2;
		}
		if(number3 > maxNumber) {
			maxNumber = number3;
		}
		System.out.println("���� ū �� : "+maxNumber);
		*/
		
		//�μ��� �Է� �޾� ū ���� ¦���̸� ����Ͻÿ�
		/*
		int su1=0, su2=0;
		System.out.println("1.�� �Է� : ");
		su1 = input.nextInt();
		System.out.println("2.�� �Է� : ");
		su2 = input.nextInt();
		if(su1 > su2 && su1 % 2 == 0) {
			System.out.println("su1�� ũ�鼭 ¦���� : "+su1);
		}
		if(su2 > su1 && su2 % 2 == 0) {
			System.out.println("su2�� ũ�鼭 ¦���� : "+su2);
		}
		*/
		//�μ��� �Է� �޾� ���� ¦���̰� 3�� ����� ���� ����Ͻÿ�
		int n1=0, n2=0, sum=0;
		System.out.println("�� �� �Է� : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		sum = n1+n2;
		if(sum % 6 == 0) {// sum % 2 == 0 && sum % 3 == 0
			System.out.println("¦���̸� 3�� �����");
		}
	}
}











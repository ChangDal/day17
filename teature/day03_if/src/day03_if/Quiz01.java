package day03_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, su2;
		System.out.print("�� �Է� : ");
		su = sc.nextInt();
		String s = (su%3 == 0)?"3�� ���":"3�� ��� �ƴ�";
		System.out.println(s);
		
		System.out.print("�� �� �Է� : ");
		su = sc.nextInt();
		su2 = sc.nextInt();
		
		int result = ( su > su2 )? su : su2 ;
		System.out.println(su+"�� "+su2+"�߿� ū���� : "+result);
		
	}
}


















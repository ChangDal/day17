package day05_switch_for;

import java.io.IOException;
import java.util.Scanner;

public class Ex02_switch {
	public static void main(String[] args) throws IOException {
		int num;
		System.out.println("���� �ϳ� �Է�");
		num = System.in.read();
		switch(num) {
			case 'a':System.out.println("a�Է� ");break;
			case 'A':System.out.println("A�Է� ");break;
		}
		
		String s = "�ȳ��ϼ���";
		switch(s) {
			case "�ȳ��ϼ���" : System.out.println("�Է�");//���ڿ��� �񱳰����ϴ�
		}
		/*
		 // �Ǽ� ���� �� �Ұ��� 
		double d = 1.111;
		switch(d) {
			case 1.111: System.out.println("�Ǽ�");
		}
		*/
	}
}





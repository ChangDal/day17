package day10_OOP;

import java.util.Scanner;

public class Quiz04_�Ҽ� {
	public void input() {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("�� �Է�");
		num = in.nextInt();
		op(num);
	}
	public void op(int num) {
		int cnt=0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				cnt++;
			}
		}
		print(cnt, num);
	}
	public void print(int c, int n) {
		if(c == 2) {
			System.out.println(n+"�� �Ҽ���");
		}else {
			System.out.println(n+"�� �Ҽ��� �ƴϴ�");
		}
	}
}





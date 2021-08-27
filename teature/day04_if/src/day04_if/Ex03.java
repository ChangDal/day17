package day04_if;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
	//수를 입력 받아 0보다 크고 100보다 작으면 정상, 아니면 비정상으로 출력
		Scanner input = new Scanner(System.in);
		int num=0;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num > 0 && num < 100 ) {
			System.out.println("정상");
		}else {
			System.out.println("아니면 비정상으로 출력");
		}
	}
}






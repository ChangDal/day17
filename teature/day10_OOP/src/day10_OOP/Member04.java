package day10_OOP;

import java.util.Scanner;

public class Member04 {
	public void reverse() {
		Scanner input = new Scanner(System.in);
		int su = 0, temp = 0;
		System.out.print("¼ö ÀÔ·Â : ");
		su = input.nextInt();
		while(true) {
			temp = su % 10;
			su = su / 10;
			System.out.print(temp+", ");
			if(su == 0)
				break;
		}
	}
}

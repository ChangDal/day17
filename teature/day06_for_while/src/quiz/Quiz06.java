package quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("╪Ж ют╥б");
		num = input.nextInt();
		for(int i=1; i<=num ; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		int sum = 0;
		for(int i=1 ; i < 1000 ; i++) {
			if(i%4==1 && i%6==1) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}







package quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, max=0, min=0;
		System.out.println("두 수 입력");
		num1 = input.nextInt(); //10
		num2 = input.nextInt(); // 20
		for(int i=1; i <= num1 && i<= num2 ; i++) {
			if(num1%i == 0 && num2 % i ==0) {
				System.out.println(i);
				min = i;
			}
		}
		System.out.println("min : "+min);
		max = num1 * num2 / min;
		System.out.println("max : "+max);
	}
}





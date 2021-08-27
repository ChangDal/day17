package quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		//2에서부터 입력된 어떤 수까지 내에 있는 소수를 찾는 프로그램을 작성하라.
		// 1과 자기 자신으로만 나눠지는 수
		// 예) 10 => 2 , 3 , 5 , 7 
		
		// 나누어지는 횟수를 찾아라. 1번만 나눠진다면 소수다
		// 상위 포문의 변수는 앞의수 , 하위 포문의 변수 뒤의수
		// 앞의수 % 뒤의수 
		Scanner input = new Scanner(System.in);
		int num, cnt=0;
		System.out.println("수 입력");
		num = input.nextInt();
		
		for(int i=2; i <= num ; i++) {
			for(int j=2; j <= i ; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				System.out.println("소수 : "+i);
			}
			cnt = 0;
		}
	}
}






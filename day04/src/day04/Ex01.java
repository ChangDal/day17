package day04;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	/*
	 * if : 참인 경우 종속문장 실행
	 * else : if의 조건이 거짓일 경우 실행
	 * if와 else는 항상 짝을 이뤄야 한다.
	 * if의 종속문장 다음에 else가 올 수 있다.
	 */
	
	int num=0;
	System.out.println("수 입력: ");
	num = input.nextInt();
	if(num % 3 == 0 )
	{
		System.out.println("3의 배수 ");
	}
	else {
		System.out.println("3의 배수 아님");
	}
	
}
}

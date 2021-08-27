package day04;

import java.util.Scanner;

public class Team4 {

	public static void main(String[] args)
	{
		//4.10살 이상 20살 미만이면 "10대 이상입니다".를 출력하고, 20살 이상 30살 미만이면 "20대입니다". 30살 이상이면 "30대 이상입니다".를 출력하시오.
		
		Scanner input = new Scanner(System.in);
		
		int age;
		
		System.out.println("나이를 입력해주세요");
		
		age = input.nextInt();
	
		if (age >= 10 && age < 20)
		{
			System.out.println("10대 이상입니다");
		}
		
		else if (age >=20 && age < 30)
		{
			System.out.println("20대 입니다");
		}
		else if (age >= 30)
		{
			System.out.println("30대 이상입니다");
		}
		else
		{
			System.out.println("어리시네요");
		}
		
	}
}

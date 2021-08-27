package day04;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int num=0;
	
	num = input.nextInt();
	
	if(num<100 && num > 0)
	{
		System.out.println("정상");
	}
	else
	{
		System.out.println("비정상");
	}
	
}
}

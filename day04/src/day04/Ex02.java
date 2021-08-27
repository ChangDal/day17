package day04;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	int su1=0,su2=0,max=0,min=0;
	System.out.println("정수 2개 입력: ");
	su1 = input.nextInt();
	su2 = input.nextInt();
	if(su1>su2)
	{
		max=su1;
		min=su2;
	}
	else
	{
		max=su2;
		min=su1;
		System.out.println("max : "+max+" , min : " +min);
	}
}
}

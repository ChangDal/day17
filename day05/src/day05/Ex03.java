package day05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name;
		while(true)
		{
			System.out.println("�̸� �Է�");
			System.out.println(">>>> : ");
			name = input.next();
			System.out.println("����� �̸���"+name+"�̱���");
			System.out.println("=====================");
		}
	}
}

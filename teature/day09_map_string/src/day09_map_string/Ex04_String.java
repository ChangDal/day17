package day09_map_string;

import java.util.Scanner;

public class Ex04_String {
	public static void main(String[] args) {
		String str = new String("test");
		//String str = "test";
		System.out.println(str);
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		str = input.next();
		System.out.println("���� str : "+str);
	}
}

package day15;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("이름 입력");
		name = input.next();
		
		Singleton si = new Singleton(name);
		Singleton si02 = new Singleton(name);
		
		si02.SetName("홍길동");
		System.out.println("si" + si.GetName());
		System.out.println("si02 : "+si02.GetName());
		
		System.out.println(si);
		System.out.println(si02);
		
	}
	
	
}

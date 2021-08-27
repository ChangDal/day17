package day15_constructor;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("이름 입력");
		name = input.next();
		
		Singleton si = new Singleton(name);
		Singleton si02 = new Singleton(name);
		
		si02.setName("홍길동");
		System.out.println("si : "+ si.getName() );
		System.out.println("si02 : "+ si02.getName() );
		
		System.out.println(si);
		System.out.println(si02);
	}
}



package day10_OOP;

import java.util.HashMap;

public class Quiz01_Main {
	public static void main(String[] args) {
		Quiz01_Big b = new Quiz01_Big();
		HashMap n = b.inputNum();
		System.out.println("main");
		System.out.println(n.get("n1"));
		System.out.println(n.get("n2"));
		
		int result = b.op(n);
		
		b.print(result);
		
		b.userInput();
		
	}
}




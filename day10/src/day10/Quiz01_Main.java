package day10;

import java.util.HashMap;

public class Quiz01_Main {
public static void main(String[] args)
{
	//입력받는기능
	//출력하는기능
	//연산하는기능
	Quiz01_Big b = new Quiz01_Big();
	HashMap n = b.inputNum();
	System.out.println("main");
	System.out.println(n.get("n1"));
	System.out.println(n.get("n2"));
	
	b.outputNum(n);
	
	int result = b.outputNum(n);
	
	b.print(result);
	
	
	
}
}

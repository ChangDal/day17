package day10;

import java.util.HashMap;

public class Quiz01_Main {
public static void main(String[] args)
{
	//�Է¹޴±��
	//����ϴ±��
	//�����ϴ±��
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
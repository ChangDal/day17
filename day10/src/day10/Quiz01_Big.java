package day10;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz01_Big {
public HashMap inputNum() {
	Scanner input = new Scanner(System.in);
	int num1,num2;
	System.out.println("ù �� �Է�");
	num1 = input.nextInt();
	
	System.out.println("�ι�° �� �Է�");
	num2 = input.nextInt();
	
	HashMap map =  new HashMap();
	map.put("n1", num1);
	map.put("n2", num2);
	
	return map;

	
}

public int outputNum(HashMap map)
{
	int big;
	System.out.println((int)map.get("n1") > (int)map.get("n2"));
	
	if((int)map.get("n1") > (int)map.get("n2"))
	{
		return (int)map.get("n1");
	}
	else
	{
		return (int)map.get("n2");	
	}
}	
	public void print(int result)
	{
		System.out.println("�μ� �� ū�� : " + result);
	}
	
	public void userInput() {
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.println("ù �� �Է�");
		num1 = input.nextInt();
		
		System.out.println("�ι�° �� �Է�");
		num2 = input.nextInt();
		outputNum(num1, num2);
	}
	public int outputNum(int n1, int n2) {
		int big =0;
		if(n1 > n2) {
			big = n1;
		}else {
			big = n2;
		}
		return big;
}
}


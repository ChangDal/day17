package day10_OOP;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz01_Big {
	public HashMap inputNum() {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.print("ù �� �Է� : ");
		num1 = input.nextInt();
		System.out.print("�� �� �Է� : ");
		num2 = input.nextInt();
		
		HashMap map = new HashMap();
		map.put("n1", num1);
		map.put("n2", num2);
		
		return map;
	}
	public int op(HashMap map) {
		System.out.println( 
				(int)map.get("n1") > (int)map.get("n2") );
		if( (int)map.get("n1") > (int)map.get("n2") ) {
			return (int)map.get("n1");
		}else {
			return (int)map.get("n2");
		}
	}
	public void print(int result) {
		System.out.println("�μ� �� ū�� : "+result);
	}
	public void userInput() {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.print("ù �� �Է� : ");
		num1 = input.nextInt();
		System.out.print("�� �� �Է� : ");
		num2 = input.nextInt();
		int big = op02(num1, num2);
		print(big);
	}
	public int op02(int n1, int n2) {
		int big=0;
		if(n1 > n2) {
			big = n1;
		}else {
			big = n2;
		}
		return big;
	}
}








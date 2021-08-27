package day03_if;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, su2;
		System.out.print("수 입력 : ");
		su = sc.nextInt();
		String s = (su%3 == 0)?"3의 배수":"3의 배수 아님";
		System.out.println(s);
		
		System.out.print("두 수 입력 : ");
		su = sc.nextInt();
		su2 = sc.nextInt();
		
		int result = ( su > su2 )? su : su2 ;
		System.out.println(su+"와 "+su2+"중에 큰수는 : "+result);
		
	}
}


















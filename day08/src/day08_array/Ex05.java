package day08_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		ArrayList foodList = new ArrayList();
		int num;
		foodList.add("설탕");
		foodList.add("소금");
		foodList.add("계란");
		foodList.add("라면");
		System.out.println(foodList);
		foodList.forEach(a -> System.out.println(a));
		System.out.println("변경할 위치 입력 : ");
		 num = input.nextInt();
		System.out.println("변경 내용 입력: ");
		String value = input.next();
		foodList.set(num, value); // 위치 변경하는 기능
		System.out.println(foodList);
		System.out.println("===============");
		for(int i=0; i<foodList.size(); i++)
		{
			System.out.println(
					i+"."+foodList.get(i));
		}
		
		System.out.println("찾는 값 입력 :");
		value = input.next();
		System.out.println(value+"위치"+foodList.indexOf(value));
		
		
	
	
	}
	
}

package day08_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
	/*
	 ������ �ִ� ����
	 �������� �ߺ��� ����Ѵ�
	 �迭�� �ٸ��� ���� ũ�⸦ ������ �ִ�.
	 List
	 - AraayList
	 - LinkedList
	 - Stack
	 ..���� �����Ѵ�
	 */
		int a =10;
		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		System.out.println(arr.contains("123"));
		arr.remove("123");
		System.out.println(arr.contains("123"));
		System.out.println(arr);
		System.out.println(arr.get(0));
		
		
	}
	

}

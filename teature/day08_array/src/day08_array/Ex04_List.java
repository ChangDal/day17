package day08_array;

import java.util.ArrayList;

public class Ex04_List {
	public static void main(String[] args) {
		/*
		 ������ �ִ� ����
		 �������� �ߺ��� ����Ѵ�
		 �迭�� �ٸ��� ���� ũ�⸦ ������ �ִ�
		 List
		 - ArrayList
		 - LinkedList
		 - Stack
		 ..���� �����Ѵ�
		 */

		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
	
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		System.out.println("���� �� : "+ arr.contains("123") );
		arr.remove("123");
		System.out.println("���� �� : "+ arr.contains("123") );
		System.out.println(arr);
		System.out.println(arr.get(0));
	}
}












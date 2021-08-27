package day08_array;

import java.util.ArrayList;

public class Ex04_List {
	public static void main(String[] args) {
		/*
		 순서가 있는 집합
		 데이터의 중복을 허용한다
		 배열과 다르게 가변 크기를 가지고 있다
		 List
		 - ArrayList
		 - LinkedList
		 - Stack
		 ..등이 존재한다
		 */

		ArrayList arr = new ArrayList();
		arr.add("123");
		arr.add("456");
	
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		System.out.println("삭제 전 : "+ arr.contains("123") );
		arr.remove("123");
		System.out.println("삭제 후 : "+ arr.contains("123") );
		System.out.println(arr);
		System.out.println(arr.get(0));
	}
}












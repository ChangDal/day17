package day08_array;

import java.util.ArrayList;
import java.util.HashSet;


public class Ex06_Set {
	public static void main(String[] args) {
		/*
		 Set
		 - HashSet
		 - TreeSet..등등
		 set
		 - 순서를 유지 하지 않아요
		 - 중복을 허용하지 않아요
		 */
		HashSet hs = new HashSet();
		hs.add("라면");
		hs.add("순대");
		hs.add("김밥");
		hs.add("순대");
		System.out.println(hs);
		
		ArrayList arr = new ArrayList();
		arr.add("라면");
		arr.add("순대");
		arr.add("김밥");
		arr.add("순대");
		System.out.println(arr);
	}
}













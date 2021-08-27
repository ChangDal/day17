package day09_map_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex03_Map {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		//HashMap map = new HashMap();
		map.put("선풍기", "100만원");
		map.put("에어컨", "1000만원");
		map.put("자동차", "10만원");
		
		System.out.println("keySet : "+map.keySet() );
		Set set = map.keySet();
		System.out.println("set : "+set );
		
		//Iterator it = map.keySet().iterator();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			// int a = (int)1.11;
			String key = (String)it.next();
			System.out.println(key + " : "+map.get(key) );
		}
		
		
		/*
		ArrayList arr = new ArrayList();
		arr.add("에어컨");
		arr.add("선풍기");
		arr.add("자동차");
		System.out.println( arr );
		*/
		//arr = map.keySet();
		/*
		String num = "1000";
		//int test = num;
		System.out.println( num.getClass() );
		
		Scanner input = new Scanner(System.in);
		int num;
		String s = input.next();
		s = input.nextInt();
		*/
	}
}












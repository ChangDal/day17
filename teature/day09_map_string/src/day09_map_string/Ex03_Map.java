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
		map.put("��ǳ��", "100����");
		map.put("������", "1000����");
		map.put("�ڵ���", "10����");
		
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
		arr.add("������");
		arr.add("��ǳ��");
		arr.add("�ڵ���");
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












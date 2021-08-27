package day08_array;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex07_Set {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("111");
		list.add("222");
		list.add("333");
		
		Iterator it = list.iterator();
		/*
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		*/
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i) );
	}
}






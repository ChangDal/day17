package day08_array;

import java.util.HashSet;
import java.util.Iterator;

public class Ex08_Set {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("111");
		hs.add("222");
		hs.add("333");
		Iterator it = hs.iterator();
		
		while( it.hasNext() ) {
			System.out.println( it.next() );
		}
	}
}

package day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex03 {
public static void main(String[] args)
{
	LinkedHashMap map = new LinkedHashMap();
	map.put("선풍기", "100만원");
	map.put("에어컨", "1000만원");
	map.put("자동차", "10만원");
	
	System.out.println("key set : " +map.keySet());
	
	System.out.println("===============");
	Set set = map.keySet();
	System.out.println("set : " + set);
	System.out.println("===============");
	Iterator it = set.iterator();
	while(it.hasNext()) {
		String key =  (String)it.next();
		System.out.println(key + " : "+map.get(key));
		
	}
}
}


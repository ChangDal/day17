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
	map.put("��ǳ��", "100����");
	map.put("������", "1000����");
	map.put("�ڵ���", "10����");
	
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


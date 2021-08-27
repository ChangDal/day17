package day09;

import java.util.HashMap;

public class Ex01 {
public static void main(String[] args)
{
	/*
	 Map
	 - HasMap
	 - TreeMap
	 - HashTable..등
	 Map
	 - {키 : 값}
	 - 순서는 유지되지 않는다
	 - 키의 중복은 허용하지 않음. 값의 중복은 허용
	 
	 */
	
	HashMap map = new HashMap();
	map.put("선풍기", "100만원");
	map.put("에어컨","10만원");
	map.put("자동차","20만원");
	
	System.out.println(map);
	
	
	System.out.println("선풍기 : "+map.get("선풍기"));
	System.out.println("에어컨 : "+map.get("에어컨"));
	System.out.println("자동차 : "+map.get("자동차"));
	System.out.println("없는값 : "+map.get("없는값"));
	
	System.out.println("결과 "+map.containsKey("에어컨"));
	
	map.replace("컴퓨터","5만원");
	
	System.out.println(map);
	
}
}

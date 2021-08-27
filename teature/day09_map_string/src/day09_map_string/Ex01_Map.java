package day09_map_string;

import java.util.HashMap;

public class Ex01_Map {
	public static void main(String[] args) {
		/*
		 Map
		 - HashMap
		 - TreeMap
		 - HashTable..등
		 Map
		 - {키 : 값}
		 - 순서는 유지되지 않는다
		 - 키의 중복은 허용하지 않음. 값의 중복은 허용
		 */
		HashMap map = new HashMap();
		map.put("선풍기", "110만원");
		map.put("에어컨", "30만원");
		map.put("자동차", "10만원");
		
		System.out.println(map);
		System.out.println("선풍기 : "+map.get("선풍기"));
		System.out.println("에어컨 : "+map.get("에어컨"));
		System.out.println("자동차 : "+map.get("자동차"));
		System.out.println("없는값 : "+map.get("없는값"));
		
		System.out.println("결과 : "+map.containsKey("에어컨"));
		//map.replace("선풍기","12345");
		map.put("선풍기","12345");
		System.out.println("변경 선풍기 : "+map.get("선풍기"));
		
		map.remove("에어컨");
		System.out.println("삭제 후 결과 : "+map.containsKey("에어컨"));
		System.out.println(map);
	}
}












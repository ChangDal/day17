package day09_map_string;

import java.util.HashMap;

public class Ex01_Map {
	public static void main(String[] args) {
		/*
		 Map
		 - HashMap
		 - TreeMap
		 - HashTable..��
		 Map
		 - {Ű : ��}
		 - ������ �������� �ʴ´�
		 - Ű�� �ߺ��� ������� ����. ���� �ߺ��� ���
		 */
		HashMap map = new HashMap();
		map.put("��ǳ��", "110����");
		map.put("������", "30����");
		map.put("�ڵ���", "10����");
		
		System.out.println(map);
		System.out.println("��ǳ�� : "+map.get("��ǳ��"));
		System.out.println("������ : "+map.get("������"));
		System.out.println("�ڵ��� : "+map.get("�ڵ���"));
		System.out.println("���°� : "+map.get("���°�"));
		
		System.out.println("��� : "+map.containsKey("������"));
		//map.replace("��ǳ��","12345");
		map.put("��ǳ��","12345");
		System.out.println("���� ��ǳ�� : "+map.get("��ǳ��"));
		
		map.remove("������");
		System.out.println("���� �� ��� : "+map.containsKey("������"));
		System.out.println(map);
	}
}












package day09;

import java.util.HashMap;

public class Ex01 {
public static void main(String[] args)
{
	/*
	 Map
	 - HasMap
	 - TreeMap
	 - HashTable..��
	 Map
	 - {Ű : ��}
	 - ������ �������� �ʴ´�
	 - Ű�� �ߺ��� ������� ����. ���� �ߺ��� ���
	 
	 */
	
	HashMap map = new HashMap();
	map.put("��ǳ��", "100����");
	map.put("������","10����");
	map.put("�ڵ���","20����");
	
	System.out.println(map);
	
	
	System.out.println("��ǳ�� : "+map.get("��ǳ��"));
	System.out.println("������ : "+map.get("������"));
	System.out.println("�ڵ��� : "+map.get("�ڵ���"));
	System.out.println("���°� : "+map.get("���°�"));
	
	System.out.println("��� "+map.containsKey("������"));
	
	map.replace("��ǻ��","5����");
	
	System.out.println(map);
	
}
}

package day09_map_string;

import java.util.*;

public class Quiz02_Map {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
HashMap map = new HashMap();
String name = null;
String price = null;
boolean bool = true;
while(bool) {
	System.out.println("1.�޴� ���");
	System.out.println("2.�޴��� ���� ����");
	System.out.println("3.����");
	System.out.print(">>> : ");
	int num = input.nextInt();
	switch(num) {
	case 1:
		System.out.print("�޴��Է� : ");
		name = input.next();
		if(map.containsKey(name) == true) {
			System.out.println("�����ϴ� �޴��Դϴ�");
			System.out.println("2���� �������� �����ϼ���");
		}else {
			System.out.print("�����Է� : ");
			price = input.next();
			map.put(name, price);
			System.out.println("����");
		}
		break;
	case 2:
		System.out.println("�޴�\t����");
		System.out.println("-------------");
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String n = (String)it.next();
			System.out.println(n+"\t"+map.get(n));
		}
		System.out.println("-------------");
		System.out.println("1.���� 2.���� 3.������");
		int su = input.nextInt();
		if(su==1) {
			System.out.print("���� �޴� �Է� : ");
			name = input.next();
			System.out.print("���� ���� �Է� : ");
			price = input.next();
			String oldPrice = 
					(String)map.replace(name, price);
			if(oldPrice == null) {
				System.out.println("���� ����");
			}else {
				System.out.println(oldPrice+"->"+price);
			}
		}else if(su == 2) {
			System.out.print("���� �޴� �Է� : ");
			name = input.next();
			if( map.remove(name) == null) {
				System.out.println("�ش� �޴��� ����");
			}else {
				System.out.println(name+"�� ���� ��!!");
			}
			//System.out.println( map.remove(name) );
			/*
			if(map.containsKey(name)) {
				map.remove(name);
				System.out.println("���� ����");
			}else {
				System.out.println("�ش� �޴��� ����");
			}
			*/
		}else {
			System.out.println("���� ������ ���� ����");
		}
		break;
	case 3:
		bool = false;
		System.out.println("�����մϴ�");
		break;
	default:System.out.println("���� ��ȣ");
	}
}
	}

}









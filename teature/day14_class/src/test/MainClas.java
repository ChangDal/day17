package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class Win7Test{
	private HashMap map;
	public void function() {
		Scanner input = new Scanner(System.in);
		String key;
		int cnt = 1;
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(cnt++ +"." + it.next());
		}
		if(map.size() != 0) {
			System.out.print("����� ��� �Է� : ");
			key = input.next();
			String value = getValue(key);
			
			if(value != null) {
				System.out.println(value);
			}else {
				System.out.println("�ش� ����� �������� �ʽ��ϴ�!!");
			}
		}else {
			System.out.println("���� ������ ����!!!");
		}
	}
	public String getValue(String key) {
		return (String)map.get(key);
	}
	public void setMap(HashMap map) {
		this.map = map;
	}
	public void auth() {
		Scanner input = new Scanner(System.in);
		System.out.println("==== ������ ��� �Դϴ�===");
		System.out.println("����� �Է��ϼ���");
		map.put(input.next(), input.next());
		System.out.println(map);
		System.out.println("���� �Ǿ����ϴ�");
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("����","calc");
		map.put("�޸���","notepad");
		
		setMap(map);
		
		int num;
		while(true) {
			System.out.println("1.���");
			System.out.println("2.����");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1: 
				function();
				break;
			case 2: 
				System.out.println("�ý����� �����մϴ�!!!");
				return ;
			case 0: 
				auth();
				break;
			default:System.out.println("�߸��Է�"); 
			}
		}
	}
}
public class MainClas {
	public static void main(String[] args) {
		Win7Test win = new Win7Test();
		win.display();
	}
}







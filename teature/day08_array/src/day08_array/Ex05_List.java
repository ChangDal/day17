package day08_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_List {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList foodList = new ArrayList();
		int num;
		foodList.add("����");
		foodList.add("�ұ�");
		foodList.add("���");
		foodList.add("���");
		System.out.println(foodList);
		
		System.out.print("������ ��ġ �Է� : ");
		num = input.nextInt();
		System.out.print("���� ���� �Է� : ");
		String value = input.next();
		foodList.set(num, value);
		System.out.println(foodList);
		System.out.println("--------------------");
		for(int i=0 ; i < foodList.size() ; i++) {
			System.out.println( i+"."+foodList.get(i) );
		}
		System.out.println("--------------------");
		
		System.out.print("ã�� �� �Է� : ");
		value = input.next();
System.out.println(value+" ��ġ : "+ foodList.indexOf(value));
	}
}













package day08_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		ArrayList foodList = new ArrayList();
		int num;
		foodList.add("����");
		foodList.add("�ұ�");
		foodList.add("���");
		foodList.add("���");
		System.out.println(foodList);
		foodList.forEach(a -> System.out.println(a));
		System.out.println("������ ��ġ �Է� : ");
		 num = input.nextInt();
		System.out.println("���� ���� �Է�: ");
		String value = input.next();
		foodList.set(num, value); // ��ġ �����ϴ� ���
		System.out.println(foodList);
		System.out.println("===============");
		for(int i=0; i<foodList.size(); i++)
		{
			System.out.println(
					i+"."+foodList.get(i));
		}
		
		System.out.println("ã�� �� �Է� :");
		value = input.next();
		System.out.println(value+"��ġ"+foodList.indexOf(value));
		
		
	
	
	}
	
}

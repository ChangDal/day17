package day14_class;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ��ɾ� �Է� : ");
		String ex = input.next();
		ProcessBuilder pro = new ProcessBuilder(ex);
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		HashMap map = new HashMap();
		map.put("����", "calc");
		map.put("�޸���", "notepad");
		
		System.out.println(map);
		
		System.out.print("���� ��ɾ� �Է� : ");
		ex = input.next();
		pro = new ProcessBuilder( (String)map.get(ex) );
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




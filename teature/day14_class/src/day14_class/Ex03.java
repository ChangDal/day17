package day14_class;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("실행 명령어 입력 : ");
		String ex = input.next();
		ProcessBuilder pro = new ProcessBuilder(ex);
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		HashMap map = new HashMap();
		map.put("계산기", "calc");
		map.put("메모장", "notepad");
		
		System.out.println(map);
		
		System.out.print("실행 명령어 입력 : ");
		ex = input.next();
		pro = new ProcessBuilder( (String)map.get(ex) );
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}




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
			System.out.print("사용할 기능 입력 : ");
			key = input.next();
			String value = getValue(key);
			
			if(value != null) {
				System.out.println(value);
			}else {
				System.out.println("해당 기능은 존재하지 않습니다!!");
			}
		}else {
			System.out.println("저장 데이터 없음!!!");
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
		System.out.println("==== 관리자 모드 입니다===");
		System.out.println("기능을 입력하세요");
		map.put(input.next(), input.next());
		System.out.println(map);
		System.out.println("저장 되었습니다");
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("계산기","calc");
		map.put("메모장","notepad");
		
		setMap(map);
		
		int num;
		while(true) {
			System.out.println("1.기능");
			System.out.println("2.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1: 
				function();
				break;
			case 2: 
				System.out.println("시스템을 종료합니다!!!");
				return ;
			case 0: 
				auth();
				break;
			default:System.out.println("잘못입력"); 
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







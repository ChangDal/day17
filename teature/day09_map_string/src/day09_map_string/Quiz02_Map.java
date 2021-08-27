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
	System.out.println("1.메뉴 등록");
	System.out.println("2.메뉴별 가격 보기");
	System.out.println("3.종료");
	System.out.print(">>> : ");
	int num = input.nextInt();
	switch(num) {
	case 1:
		System.out.print("메뉴입력 : ");
		name = input.next();
		if(map.containsKey(name) == true) {
			System.out.println("존재하는 메뉴입니다");
			System.out.println("2번의 수정으로 수정하세요");
		}else {
			System.out.print("가격입력 : ");
			price = input.next();
			map.put(name, price);
			System.out.println("저장");
		}
		break;
	case 2:
		System.out.println("메뉴\t가격");
		System.out.println("-------------");
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String n = (String)it.next();
			System.out.println(n+"\t"+map.get(n));
		}
		System.out.println("-------------");
		System.out.println("1.수정 2.삭제 3.나가기");
		int su = input.nextInt();
		if(su==1) {
			System.out.print("수정 메뉴 입력 : ");
			name = input.next();
			System.out.print("수정 가격 입력 : ");
			price = input.next();
			String oldPrice = 
					(String)map.replace(name, price);
			if(oldPrice == null) {
				System.out.println("수정 실패");
			}else {
				System.out.println(oldPrice+"->"+price);
			}
		}else if(su == 2) {
			System.out.print("삭제 메뉴 입력 : ");
			name = input.next();
			if( map.remove(name) == null) {
				System.out.println("해당 메뉴는 없음");
			}else {
				System.out.println(name+"은 삭제 됨!!");
			}
			//System.out.println( map.remove(name) );
			/*
			if(map.containsKey(name)) {
				map.remove(name);
				System.out.println("삭제 성공");
			}else {
				System.out.println("해당 메뉴는 없음");
			}
			*/
		}else {
			System.out.println("현재 내용을 빠져 나감");
		}
		break;
	case 3:
		bool = false;
		System.out.println("종료합니다");
		break;
	default:System.out.println("없는 번호");
	}
}
	}

}









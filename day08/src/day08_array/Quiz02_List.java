package day08_array;

import java.util.*;

public class Quiz02_List {
	public static void main(String [] args){
	int c;
		
		
		c = (370000*4+185000*4+350000*4+235000*4);
		System.out.println(c);
		
		Scanner input = new Scanner(System.in);
		ArrayList arrName = new ArrayList();
		ArrayList arrPhNum = new ArrayList();
		String name=null, phNum=null;
		int num, index;
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("저장 할 이름 : ");
				name = input.next();
				if(arrName.contains(name) == false ) {
					arrName.add(name);
					System.out.print("저장 할 전화번호 : ");
					//phNum = input.next();
					arrPhNum.add( input.next() );
					System.out.println("저장 완료");
				}else {
					System.out.println(name+"님은 중복 입니다.");
				}
				break;
			case 2:
				System.out.print("찾을 이름 입력 : ");
				name = input.next();
				//indexOf : 값이 있으면 값의 인덱스 번호를 알려줌
				// 값이 없으면 -1 을 알려줌
				index = arrName.indexOf(name);
				if(index != -1) {
					System.out.println(arrName.get(index)+":"+
											arrPhNum.get(index));
				}else {
					System.out.println(name+"님은 존재하지 않습니다");
				}
				break;
			case 3:
				System.out.print("삭제할 이름 입력 : ");
				name = input.next();
				index = arrName.indexOf(name);
				
				if(index != -1) {
					arrName.remove(index);
					arrPhNum.remove(index);
					System.out.println("삭제 성공");
				}else {
					System.out.println(name+"님은 존재하지 않습니다");
				}
				break;
			case 4:
				System.out.println(arrName);
				System.out.println(arrPhNum);
				System.out.println("-----------");
				System.out.println("이름\t전화번호");
				for(int i=0; i < arrName.size(); i++) {
					System.out.println(arrName.get(i)+"\t"
											+arrPhNum.get(i));
				}
				break;
			case 5:break;
			}
		}
	}

}









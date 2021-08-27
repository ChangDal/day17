package day12_ClassVariable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
random과 hashmap을 이용하여 10가지 수를 받아 value값에넣어야한다.
만약, 중복 일시 다른 수를 value값에 넣어야 하고 key 값에는 i 의 수를 넣도록 한다.
printMap 함수를 이용하여 hashmap에 들어있는 전체 key 와 value 값을 보여주고 op함수를
이용하여 value전체의 합을 구한다.
printSum 함수를 이용하여 합의 값을 출력하시오.
printmap과 op함수에는 iterator를 사용한다.
 */
class RamHsh{
	public HashMap input() {
		Scanner in = new Scanner(System.in);
		HashMap map = new HashMap();
		int i = 0;
		while(map.size() < 3){
			System.out.println("value 입력");
			//String value = in.next();
			int value = (int)(Math.random()*100+1);
			//if(!map.containsValue(value))
			if(map.containsValue(value) == false) {
				map.put(i++ , value );
				System.out.println("저장 완료");
			}else {
				System.out.println("해당하는 값이 존재 합니다.");
			}
		}
		return map;
	}
	public void printMap(HashMap map) {
		Iterator it = map.keySet().iterator();
		while( it.hasNext() ) {
			int key = (int)it.next();
			System.out.println(key+" : "+map.get(key));
		}
		op(map);
	}
	public void op(HashMap map) {
		Iterator it = map.keySet().iterator();
		int sum=0;
		while( it.hasNext() ) {
			sum += (int)map.get(it.next());
		}
		printSum(sum);
	}
	public void printSum(int sum) {
		System.out.println(sum);
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		RamHsh rh = new RamHsh();
		HashMap map = rh.input();
		rh.printMap(map);
	}
}





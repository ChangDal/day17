package day12_ClassVariable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
random�� hashmap�� �̿��Ͽ� 10���� ���� �޾� value�����־���Ѵ�.
����, �ߺ� �Ͻ� �ٸ� ���� value���� �־�� �ϰ� key ������ i �� ���� �ֵ��� �Ѵ�.
printMap �Լ��� �̿��Ͽ� hashmap�� ����ִ� ��ü key �� value ���� �����ְ� op�Լ���
�̿��Ͽ� value��ü�� ���� ���Ѵ�.
printSum �Լ��� �̿��Ͽ� ���� ���� ����Ͻÿ�.
printmap�� op�Լ����� iterator�� ����Ѵ�.
 */
class RamHsh{
	public HashMap input() {
		Scanner in = new Scanner(System.in);
		HashMap map = new HashMap();
		int i = 0;
		while(map.size() < 3){
			System.out.println("value �Է�");
			//String value = in.next();
			int value = (int)(Math.random()*100+1);
			//if(!map.containsValue(value))
			if(map.containsValue(value) == false) {
				map.put(i++ , value );
				System.out.println("���� �Ϸ�");
			}else {
				System.out.println("�ش��ϴ� ���� ���� �մϴ�.");
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





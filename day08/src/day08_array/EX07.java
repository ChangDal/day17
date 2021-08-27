package day08_array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class EX07 {

		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			
			ArrayList list = new ArrayList();
			list.add("111");
			list.add("222");
			list.add("333");
			
			
			Iterator it = list.iterator();
			System.out.println(it.hasNext());
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.hasNext());
			//iterator는 bof(시작) (값들) eof(끝)으로 구성됨
			//hasnext 다음에 값이 있는지 알아보는 언어
}
}


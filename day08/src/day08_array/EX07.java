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
			//iterator�� bof(����) (����) eof(��)���� ������
			//hasnext ������ ���� �ִ��� �˾ƺ��� ���
}
}


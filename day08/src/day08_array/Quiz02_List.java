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
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("���� �� �̸� : ");
				name = input.next();
				if(arrName.contains(name) == false ) {
					arrName.add(name);
					System.out.print("���� �� ��ȭ��ȣ : ");
					//phNum = input.next();
					arrPhNum.add( input.next() );
					System.out.println("���� �Ϸ�");
				}else {
					System.out.println(name+"���� �ߺ� �Դϴ�.");
				}
				break;
			case 2:
				System.out.print("ã�� �̸� �Է� : ");
				name = input.next();
				//indexOf : ���� ������ ���� �ε��� ��ȣ�� �˷���
				// ���� ������ -1 �� �˷���
				index = arrName.indexOf(name);
				if(index != -1) {
					System.out.println(arrName.get(index)+":"+
											arrPhNum.get(index));
				}else {
					System.out.println(name+"���� �������� �ʽ��ϴ�");
				}
				break;
			case 3:
				System.out.print("������ �̸� �Է� : ");
				name = input.next();
				index = arrName.indexOf(name);
				
				if(index != -1) {
					arrName.remove(index);
					arrPhNum.remove(index);
					System.out.println("���� ����");
				}else {
					System.out.println(name+"���� �������� �ʽ��ϴ�");
				}
				break;
			case 4:
				System.out.println(arrName);
				System.out.println(arrPhNum);
				System.out.println("-----------");
				System.out.println("�̸�\t��ȭ��ȣ");
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









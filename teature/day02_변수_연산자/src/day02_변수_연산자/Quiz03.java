package day02_����_������;

import java.io.IOException;

public class Quiz03 {
	public static void main(String[] args) throws IOException {
		int num;
		System.out.print("���� �Է� : ");
		num = System.in.read();
		
		System.out.println("==== ��� ====");
System.out.println("�Է��Ͻ� ���� : "+(char)num);
System.out.println("�Է��Ͻ� ���� : "+(char)(num+32));
System.out.println("------------------------");
System.in.read();System.in.read();
		System.out.println("�� �Է� : ");
		num = System.in.read();
		System.out.println("==== ��� ====");
	System.out.println("�Է��Ͻ� �� : "+(char)num);
		System.out.println("��ȯ �� �� : "+( num - 48 ));

	}
}






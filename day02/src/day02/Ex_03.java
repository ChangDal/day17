package day02;

import java.io.IOException;

public class Ex_03 {
public static void main(String[] args) throws IOException
{
	char val;
	int val01;
	
	System.out.println("���� �Է� : ");
	val =  (char)System.in.read();
	System.out.println("==== �� �� ====");
	System.out.println("�Է��Ͻ� ���� : "+ val);
	
	val01 = (int)val+32; 

	
	System.out.println("�ҹ��ڷ� ��ȯ : "+ (char)val01);
	//�ƽ�Ű�ڵ� A��65 0X41 a�� 97 0X61 
	
}
}


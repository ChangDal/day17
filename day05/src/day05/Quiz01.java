package day05;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int day;
    System.out.println("��¥ �Է�: ");
    day = input.nextInt();
    day = day%7;
    switch(day)
    {

    case 1: System.out.println("������");break;
    case 2: System.out.println("ȭ����");break;
    case 3: System.out.println("������");break;
    case 4: System.out.println("�����");break;
    case 5: System.out.println("�ݿ���");break;
    case 6: System.out.println("�����");break;
    case 0: System.out.println("�Ͽ���");break;
    }
    
	String home = null;
	String company = null;
	
	
	int select = 0;
	
	while(true)
	
	{
	
		System.out.println("1.�츮�� ���");
		System.out.println("2.ȸ�� ���");
		System.out.println("3.��� ����");
		
		select = input.nextInt();
		
		switch(select) 
		{
		case 1: home = input.next();
		System.out.println("��� ����"); break;
		case 2: company = input.next();
		System.out.println("��� ����"); break;
		case 3: System.out.println("�츮���� "+home);
		System.out.println("ȸ��� "+company);
		}
	
}
}
}



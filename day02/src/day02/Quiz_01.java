package day02;

import java.util.Scanner;

public class Quiz_01 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	String name;
	int kor,eng,mass,hap;
    System.out.println("����� �̸��� �����Դϱ�?");
	name = input.next();
	System.out.println(name+ " ���� ���� ���� : " );
	kor = input.nextInt();
	System.out.println(name+" ���� ���� ���� : " );
	eng = input.nextInt();
	System.out.println(name+" ���� ���� ���� : " );
	mass = input.nextInt();
	hap = kor+eng+mass;
	System.out.println("============");
	System.out.println("�� �� :"+name);
	System.out.println("============");
	System.out.println("�� �� : "+kor);
	System.out.println("�� �� : "+eng);
	System.out.println("�� �� : "+mass);
	System.out.println("============");
	System.out.println("�� �� :"+hap);
	System.out.println("============");
	
	
	
	
}
}

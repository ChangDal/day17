package day04;

import java.util.Scanner;

public class Team1 {
public static void main(String[] args)
{
	// 3���� �л��� ���� ���� ���� ��ȸ ���� ������ �հ� �� ����� ���ؼ� ����� 90�̻� A 80�̻� B  70�̻� C 60�̻� D �� �̸� F�� ������ּ���
	
	Scanner input = new Scanner(System.in);
	
	String name,name2,name3;

	int kor=0,eng=0,mass=0,society=0,science=0;
	
	int max =0, average=0;
	
	System.out.println("�̸��� �Է����ּ���");
	name= input.next();
	System.out.println(name+"�� ���� ������ �Է��ϼ���");
	kor = input.nextInt();
	System.out.println(name+"�� ���� ������ �Է��ϼ���");
	eng = input.nextInt();
	System.out.println(name+"�� ���� ������ �Է��ϼ���");
	mass = input.nextInt();
	System.out.println(name+"�� ��ȸ ������ �Է��ϼ���");
	society = input.nextInt();
	System.out.println(name+"�� ���� ������ �Է��ϼ���");
	science = input.nextInt();
	
	max = kor+eng+mass+society+science;
	average = max/5;
	
	System.out.println(name+"������ �� ���� : " +max);
	System.out.println(name+"������ �� ����� : "+average);
	
	if (average >= 90)
	{
		System.out.println(name+" �� ������ A�Դϴ�");
	}
	
	else if (average >= 80)
	{
		System.out.println(name+" �� ������ B�Դϴ�");
	}
	
	else if (average >= 70)
	{
		System.out.println(name+" �� ������ C�Դϴ�");
	}
	
	else if (average >= 60)
	{
		System.out.println(name+" �� ������ D�Դϴ�");
	}
	else
	{
		System.out.println(name+" �� ������ F�Դϴ�");
	}
	
	System.out.println("�̸��� �Է����ּ���");
	name2= input.next();
	
	System.out.println(name2+"�� ���� ������ �Է��ϼ���");
	kor = input.nextInt();
	System.out.println(name2+"�� ���� ������ �Է��ϼ���");
	eng = input.nextInt();
	System.out.println(name2+"�� ���� ������ �Է��ϼ���");
	mass = input.nextInt();
	System.out.println(name2+"�� ��ȸ ������ �Է��ϼ���");
	society = input.nextInt();
	System.out.println(name2+"�� ���� ������ �Է��ϼ���");
	science = input.nextInt();
	
	max = kor+eng+mass+society+science;
	average = max/5;
	
	System.out.println(name+"������ �� ���� : " +max);
	System.out.println(name+"������ �� ����� : "+average);
	
	if (average >= 90)
	{
		System.out.println(name+" �� ������ A�Դϴ�");
	}
	
	else if (average >= 80)
	{
		System.out.println(name+" �� ������ B�Դϴ�");
	}
	
	else if (average >= 70)
	{
		System.out.println(name+" �� ������ C�Դϴ�");
	}
	
	else if (average >= 60)
	{
		System.out.println(name+" �� ������ D�Դϴ�");
	}
	else
	{
		System.out.println(name+" �� ������ F�Դϴ�");
	}
	
	System.out.println("�̸��� �Է����ּ���");
	name3= input.next();
	
	System.out.println(name3+"�� ���� ������ �Է��ϼ���");
	kor = input.nextInt();
	System.out.println(name3+"�� ���� ������ �Է��ϼ���");
	eng = input.nextInt();
	System.out.println(name3+"�� ���� ������ �Է��ϼ���");
	mass = input.nextInt();
	System.out.println(name3+"�� ��ȸ ������ �Է��ϼ���");
	society = input.nextInt();
	System.out.println(name3+"�� ���� ������ �Է��ϼ���");
	science = input.nextInt();
	
	max = kor+eng+mass+society+science;
	average = max/5;
	
	System.out.println(name3+"������ �� ���� : " +max);
	System.out.println(name3+"������ �� ����� : "+average);
	if (average >= 90)
	{
		System.out.println(name3+" �� ������ A�Դϴ�");
	}
	
	else if (average >= 80)
	{
		System.out.println(name3+" �� ������ B�Դϴ�");
	}
	
	else if (average >= 70)
	{
		System.out.println(name3+" �� ������ C�Դϴ�");
	}
	
	else if (average >= 60)
	{
		System.out.println(name3+" �� ������ D�Դϴ�");
	}
	else
	{
		System.out.println(name3+" �� ������ F�Դϴ�");
	}
	
}
}

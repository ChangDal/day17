package day04;

import java.util.Scanner;

public class Team4 {

	public static void main(String[] args)
	{
		//4.10�� �̻� 20�� �̸��̸� "10�� �̻��Դϴ�".�� ����ϰ�, 20�� �̻� 30�� �̸��̸� "20���Դϴ�". 30�� �̻��̸� "30�� �̻��Դϴ�".�� ����Ͻÿ�.
		
		Scanner input = new Scanner(System.in);
		
		int age;
		
		System.out.println("���̸� �Է����ּ���");
		
		age = input.nextInt();
	
		if (age >= 10 && age < 20)
		{
			System.out.println("10�� �̻��Դϴ�");
		}
		
		else if (age >=20 && age < 30)
		{
			System.out.println("20�� �Դϴ�");
		}
		else if (age >= 30)
		{
			System.out.println("30�� �̻��Դϴ�");
		}
		else
		{
			System.out.println("��ó׿�");
		}
		
	}
}

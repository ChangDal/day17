package day05;

import java.util.Scanner;

public class Team4 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	/*�����ȣ�� �Է¹޾� ���ǽǹ�ȣ�� ���!
������ 1.���� 2.���� 3.���� 4.����
1�̸� "101ȣ �Դϴ�"
2�� "102ȣ �Դϴ�"
3�̸� "203ȣ �Դϴ�"
4�� "204ȣ �Դϴ�"
�������� "�������� ���� ���ּ���" �� ���!
(ex. 5�� �Է½� "�������� ���� ���ּ���" ���)*/
	
	int classNum;
	System.out.println("1.���� 2.���� 3.���� 4.����");
	
	
	classNum = input.nextInt();
	
	
	if(classNum == 1)
	{
		System.out.println("101ȣ�Դϴ�");
	}
	else if(classNum == 2)
	{
		System.out.println("102ȣ�Դϴ�");
	}
	else if(classNum == 3)
	{
		System.out.println("203ȣ�Դϴ�");
	}
	else if(classNum == 4)
	{
		System.out.println("204ȣ�Դϴ�");
	}
	else
	{
		System.out.println("�������� ���� ���ּ���");
	}
	
	
	
	
	//����2. ���ڸ� �Է½� ¦��,Ȧ���� �����ϰԲ� ���!
	//ex. ���ڸ� �Է��Ͻÿ� >> 5 >>>Ȧ���Դϴ�
	
	int num;
	
	System.out.println("���ڸ� �Է��ϼ���");
	
	num = input.nextInt();
	
	if (num%2 == 0)
	{
		System.out.println(num+"¦���Դϴ�");
	}
	else 
	{
		System.out.println(num+"Ȧ���Դϴ�");
	}
	
	//����3. ������ �Է¹޾� ������ 90�̻��̸� A, 90�̸� 80�̻��̸� B, 80�̸� 70�̻��̸� C, 70�̸� 60�̻��̸� D, �� �̸��̸� F ���
	//ex. ������ �Է��Ͻÿ� >>> 90 >>> ����� A�����Դϴ�.
	
	
	int exam = 0;
	System.out.println("���������� �Է��ϼ���");
	
	exam = input.nextInt();
	
	if(exam >= 90)
	{
		System.out.println(exam+"����� ���������� A�����Դϴ�");
	}
	else if(exam >= 80)
	{
		System.out.println(exam+"����� ���������� B�����Դϴ�");
	}
	else if(exam >= 70)
	{
		System.out.println(exam+"����� ���������� C�����Դϴ�");
	}
	else if(exam >= 60)
	{
		System.out.println(exam+"����� ���������� D�����Դϴ�");
	}
	else
	{
		System.out.println(exam+"����� ���������� F�����Դϴ�");
	}
	
	//����4. 0~20���� ���
	
	for(int i=0; i<=20; i++)
	{
	   System.out.print(" "+ i);
	}
	
	//����5. 0~20���� ¦���� ���
	System.out.println();
	for(int i=0; i<=20; i++)
	{
		if(i%2 == 0)
		{
			   System.out.print(" "+ i);
		}
	
	}
}
}

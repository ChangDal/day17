package day04;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int coffee = 2000; int num = 0; int hap=20000;
	
	System.out.println("Ŀ���� ������ �Է��ϼ��� : ");
	num = input.nextInt();
	
	if(num>10)
	{
	    coffee=1500;
		System.out.println("Ŀ���� ������ ������ �����ϴ�: "+(hap+((num-10)*coffee)));
	}

	else if(num < 10) 
	{
		System.out.println("Ŀ���� ������ ������ �����ϴ�: "+num*coffee);
	}
	
	 int number = 0;
	 
	 System.out.println("���� �Է��ϼ��� : ");
	 number = input.nextInt();
	 
	 if(number == 0)
	 {
		 System.out.println("�߸� �Է��ϼ̽��ϴ�");
	 }
	 else if(number%12 == 0)
	 {
		 System.out.println(number+" �� 3�� ����̸鼭, 4�� ����Դϴ�");
	 }
	 
	 else if(number%3 ==0)
	 {
		 System.out.println(number+"�� 3�� ����Դϴ�");
	 }
	 else if(number%4 ==0)
	 {
		 System.out.println(number+"�� 4�� ����Դϴ�");
     }

	 else
	 {
		 System.out.println(number+"�� 3�ǹ���� 4�� ����� �ƴմϴ�");
	 }

}
}
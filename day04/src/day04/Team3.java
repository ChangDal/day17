package day04;

import java.util.Scanner;

public class Team3 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		/*�ڸ��� �ʵ��б����� 1�г���� 4�г���� �߰���� ������ ���Ҵ�. 

	    4�г��� 70�� �̻��̸� �հ�, �� �̿��� �г��� 60�� �̻��̸� �հ��̴�. 

	    �̸� �Ǵ��ϴ� ���α׷��� �ۼ��غ���.

	    ������ 0�̸� 100�ʰ��̸� ����� ���!
			*/
		
		int grade1, grade2, grade3, grade4;
		int result;
		
		
		System.out.println("1�г������� �Է��ϼ���");
		grade1 = input.nextInt();
		
		result = grade1;
		if (result >=60 && result != 0 && result <= 100)
		{
			System.out.println("�հ�");
		}
		else if(result < 0 || result > 100)
		{
			System.out.println("������ �߸� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("���հ�");
		}
		
		System.out.println("2�г������� �Է��ϼ���");
		grade2 = input.nextInt();
		
		result = grade2;
		if (result >=60 && result != 0 && result <= 100)
		{
			System.out.println("�հ�");
		}
		
		else if(result < 0 || result > 100)
		{
			System.out.println("������ �߸� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("���հ�");
		}
		
		System.out.println("3�г������� �Է��ϼ���");
		grade3 = input.nextInt();
		
		result = grade3;
		if (result >=60 && result != 0 && result <= 100)
		{
			System.out.println("�հ�");
		}
		
		else if(result < 0 || result > 100)
		{
			System.out.println("������ �߸� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("���հ�");
		}
		
		System.out.println("4�г� ������ �Է��ϼ���");
		grade4 = input.nextInt();
		
		result = grade4;
		if (result >=70 && result != 0 && result <= 100)
		{
			System.out.println("�հ�");
		}
		
		else if(result < 0 || result > 100)
		{
			System.out.println("������ �߸� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("���հ�");
		}
		
		
				
			
				
	}
}

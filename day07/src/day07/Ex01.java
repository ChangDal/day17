package day07;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int i, sum=0;
	while(true)
	{
		System.out.println("�� �Է� (1~100");
		i = input.nextInt();
		if(i >=1 && i <=100)
		{
			break;
			
		}
		System.out.println("�ٽ� �Է��ϼ���");
		
		}
	for(int j=1; j<=i;j++)
	{
		sum+=j;
		System.out.println("1~�Է��� �� ������ ��: "+sum);
	}
}
}

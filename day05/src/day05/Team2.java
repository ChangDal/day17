package day05;

import java.util.Scanner;

public class Team2 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
		//�ΰ��� �ֻ����� ������ �� �ֻ����� ���� 6�� �Ǵ� ����� ���� ����Ͻÿ�  
			
	int i =0, j=0;
	int sum=0;
	for(i = 1; i <= 6; i++)
	{
		
		for(j = 1; j <= 6; j++)
		{
			if(i+j==6)
			{
				sum= sum+1;
			}
		}
	}
	System.out.println("�ֻ����� ����Ǽ���"+sum);

	//1~100 �߿��� 2�� ����̸鼭 3�� ����� ������ ���Ͻÿ�
	sum = 0;
	for(i=1; i<=100; i++)
	{
		if(i%2 == 0 && i%3 == 0)
		{
			sum= sum+1;
		}
	
	}
	
	System.out.println("1���� 100������ 2�ǹ���̸鼭 3�ǹ���� ������ "+ sum);
	
	//  1 ���� 100 ������ ���� �߿��� ¦������ ���� ����Ͽ� ������� ����ϴ� ���α׷��� �����Ѵ�.
    //- ��, ���ǹ��� ������� �ʵ��� �ϸ�, while �ݺ����� ����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
	
	i= 0;
	sum = 0;
	while(i < 100)
	{
		i= i+2;
		
		sum= sum+i;
	}
	System.out.println("¦������ ����"+sum);
	
	//for���� �̿��Ͽ� 24�ð���  ǥ�� �Ͻÿ�  - 23�� 59�� 59�� ���� ����� �������� 
	
	for(i =1; i<=24; i++)
	{
		for(j=0;j<=59;j++)
		{
			System.out.println("�ð�ǥ��"+i+"�ð�"+j+"��"+j+"��");
		}
	}
	
	//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�.
	sum=0;
	for(i = 1; i<= 20; i++)
	{
		for(j=1; j<=i; j++)
		{
			sum=sum+j;
		}
	}
	System.out.println(sum);
	
	
	
}
}

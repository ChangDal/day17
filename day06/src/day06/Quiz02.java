package day06;

public class Quiz02 {
public static void main(String[] args)
{
	/*1~1000���̿� �ִ� �ڿ����� ���Ͽ� �ڱ� �ڽ��� ���� ������
	 * ��� ����� ���� �ڽŰ� �������� ��(������)�� ���Ͽ���.
	 * ��) 6�� ��� = 1,2,3,6
	 * 1+2+3 = 6(������)
	 * 6, 20����, 400����
	 */
	
	int perpectNum = 0;
	int sum = 0;
	
	for(int i = 1; i<=1000; i++)
	{
		
		for(int j = 1; 
				j<=i; j++)
		{
			
			if(i%j==0 && i != j)
			{
				sum+=j;
			 
				
		     }
	
			
			
		}
		if(sum == i)
		{
			perpectNum = sum;
			System.out.println(perpectNum);
		}
		sum = 0;
	}
	
}
}
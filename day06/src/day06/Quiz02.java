package day06;

public class Quiz02 {
public static void main(String[] args)
{
	/*1~1000사이에 있는 자연수에 대하여 자기 자신의 수를 제외한
	 * 모든 약수의 합이 자신과 같아지는 수(완전수)를 구하여라.
	 * 예) 6의 약수 = 1,2,3,6
	 * 1+2+3 = 6(완전수)
	 * 6, 20번때, 400번떄
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

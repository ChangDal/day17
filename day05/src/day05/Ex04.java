package day05;

public class Ex04 {
public static void main(String[] args)
{
	//반복문 사용 조건
	// 규칙적인 값을 가지고 있을 때 반복문 사용 가능
	// for(초기값 ; 조건식 ; 증감식)
	// {조건 문장}
	
	int num=0;
	int sum=0;
	for( num = 1; num<=10; num = num +1)
	{
		sum= sum+num;
		
	}
	System.out.println(sum);
}
}

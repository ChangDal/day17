package day06;

import java.util.Scanner;

public class Quiz08 {
public static void  main(String[] args)
{
	//2에서부터 입력된 어떤 수까지 내에 있는 소수를 찾는 프로그램을 작성하라
	//소수란 1과 자기자신으로만 나눠지는 수
	// 10 = > 2, 3, 5, 7
	Scanner input = new Scanner(System.in);
	
	int num = 0 ;
	int cnt = 0;
	
	System.out.println("숫자입력");
	num = input.nextInt();
	
       for(int i = 2; i<= num; i++)
       {
    	   
       for(int j = 2; j<=i; j++)
       {
    	   if(i%j == 0)
    	   {
    		   cnt++;
    	   }
    	  
       }
       if(cnt == 1)
       {
    	   System.out.println("소수 : "+ i);
       }
       cnt = 0;
       }
       
       
}
}

package day06;

import java.util.Scanner;

public class Quiz08 {
public static void  main(String[] args)
{
	//2�������� �Էµ� � ������ ���� �ִ� �Ҽ��� ã�� ���α׷��� �ۼ��϶�
	//�Ҽ��� 1�� �ڱ��ڽ����θ� �������� ��
	// 10 = > 2, 3, 5, 7
	Scanner input = new Scanner(System.in);
	
	int num = 0 ;
	int cnt = 0;
	
	System.out.println("�����Է�");
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
    	   System.out.println("�Ҽ� : "+ i);
       }
       cnt = 0;
       }
       
       
}
}
package day08_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("¦��,Ȧ�� �Է�: ");
		odd_even = input.next();
		
		
		for(int i=0; i<arr.length;i++)
		{
		
				if(odd_even.equals("¦��") && arr[i]%2==0 )
				{
					System.out.println("¦�� : "+arr[i]);
				}
			
				else if(odd_even.equals("Ȧ��") && arr[i]%2!=0 )
				{
				 System.out.println("Ȧ�� : "+arr[i]);
				}
		}

	
		
		
	}
	
}

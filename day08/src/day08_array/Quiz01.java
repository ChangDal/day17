package day08_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("礎熱,?汝? 殮溘: ");
		odd_even = input.next();
		
		
		for(int i=0; i<arr.length;i++)
		{
		
				if(odd_even.equals("礎熱") && arr[i]%2==0 )
				{
					System.out.println("礎熱 : "+arr[i]);
				}
			
				else if(odd_even.equals("?汝?") && arr[i]%2!=0 )
				{
				 System.out.println("?汝? : "+arr[i]);
				}
		}

	
		
		
	}
	
}

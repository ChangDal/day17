package day08_array;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int [] arr = new int[] {10,20,30};
		int [] arr02 = {40,50,60};
		for(int i =0; i<arr.length;i++)
		{
			System.out.println("arr : "+arr[i]);
			System.out.println("arr02 : "+arr02[i]);
		}
}
}

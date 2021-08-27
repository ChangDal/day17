package day08_array;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	/*
	 * 배열 : 같은  자료형으로 연속된 공간을 만드는 것
	 * 배열을 만드는 방법
	 * - 자료형 [] 변수명(배열명);
	 * 자료형 변수명(배열명)[];
	 */
	
   int [] arr = new int[5];
   
   arr[0] = 100;
   arr[1] = 200;
   arr[2] = 300;
   arr[3] = 400;
   arr[4] = 500;
  
   
   System.out.println("arr[0] : " + arr[0]);
   System.out.println("arr[1] : " + arr[1]);
   System.out.println("arr[2] : " + arr[2]);
   System.out.println("arr[3] : " + arr[3]);
   System.out.println("arr[4] : " + arr[4]);
 
   int arr02[] = new int[5];
   for(int  i= 0; i < arr.length; i++)
   {
	   arr02[i] = 100* (i+1);
	   System.out.println(arr02[i]);
   }
   
   
}
}

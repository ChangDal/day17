package day08_array;

import java.util.Scanner;

public class Quiz01_Array {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even=null;
		System.out.print("Â¦¼ö, È¦¼ö ÀÔ·Â : ");
		odd_even = input.next();
		if(odd_even.equals("Â¦¼ö")) {
			for(int i=0; i< arr.length ; i++) {
				if(arr[i] % 2 == 0) {
					System.out.println(arr[i]);
				}
			}
		}else {
			for(int i=0; i< arr.length ; i++) {
				if(arr[i] % 2 != 0) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}








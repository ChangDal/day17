package day08_array;

import java.util.Scanner;

public class Ex03 {

		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			String[] name = new String[3];
			for(int i =0; i < name.length; i++)
			{
				System.out.println(i+1+"��° �̸� �Է�");
				name[i] = input.next();
				
			}
			
			for(int j = 0; j<name.length;j++)
			{
				System.out.println(j+1+"�̸� :"+name[j]);
			}
		
		}
}


package day13;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	int select = 0;
	Quiz01_private ex = new Quiz01_private();
	Scanner sc = new Scanner(System.in);
	
	while(select != 3)
	{
		System.out.println("1.�α��� 2.�� �� 3.�α׾ƿ�");
		System.out.println(">>>");
		select = sc.nextInt();
	switch(select)
	{
	
	case 1:
	ex.login();
	break;
	case 2:
	ex.join();
	break;
	case 3:
	break;
	}
	}
}
}

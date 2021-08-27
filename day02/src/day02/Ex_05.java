package day02;

import java.util.Scanner;

public class Ex_05 {
public static void main(String[] args){
	
 Scanner input = new Scanner(System.in);
 int num;
 String name;
 int height;
 System.out.println("이름 입력 : ");
 name = input.next();
 System.out.println("나이 입력 : ");
 num = input.nextInt();
 System.out.println("키 입력 : ");
 height = input.nextInt();
 System.out.println("이름 :" +name);
 System.out.println("나이 :" +num);
 System.out.println("키 :" + height);
}
}

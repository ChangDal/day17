package day02;

import java.util.Scanner;

public class Ex_05 {
public static void main(String[] args){
	
 Scanner input = new Scanner(System.in);
 int num;
 String name;
 int height;
 System.out.println("�̸� �Է� : ");
 name = input.next();
 System.out.println("���� �Է� : ");
 num = input.nextInt();
 System.out.println("Ű �Է� : ");
 height = input.nextInt();
 System.out.println("�̸� :" +name);
 System.out.println("���� :" +num);
 System.out.println("Ű :" + height);
}
}

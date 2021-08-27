package day02;

import java.util.Scanner;

public class Quiz_01 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
		
	String name;
	int kor,eng,mass,hap;
    System.out.println("당신의 이름은 무엇입니까?");
	name = input.next();
	System.out.println(name+ " 님의 국어 점수 : " );
	kor = input.nextInt();
	System.out.println(name+" 님의 영어 점수 : " );
	eng = input.nextInt();
	System.out.println(name+" 님의 수학 점수 : " );
	mass = input.nextInt();
	hap = kor+eng+mass;
	System.out.println("============");
	System.out.println("이 름 :"+name);
	System.out.println("============");
	System.out.println("국 어 : "+kor);
	System.out.println("영 어 : "+eng);
	System.out.println("수 학 : "+mass);
	System.out.println("============");
	System.out.println("합 계 :"+hap);
	System.out.println("============");
	
	
	
	
}
}

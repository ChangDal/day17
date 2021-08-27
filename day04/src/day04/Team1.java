package day04;

import java.util.Scanner;

public class Team1 {
public static void main(String[] args)
{
	// 3명의 학생의 국어 영어 수학 사회 과학 점수의 합계 및 평균을 구해서 평균이 90이상 A 80이상 B  70이상 C 60이상 D 그 미만 F로 출력해주세요
	
	Scanner input = new Scanner(System.in);
	
	String name,name2,name3;

	int kor=0,eng=0,mass=0,society=0,science=0;
	
	int max =0, average=0;
	
	System.out.println("이름을 입력해주세요");
	name= input.next();
	System.out.println(name+"의 국어 점수를 입력하세요");
	kor = input.nextInt();
	System.out.println(name+"의 영어 점수를 입력하세요");
	eng = input.nextInt();
	System.out.println(name+"의 수학 점수를 입력하세요");
	mass = input.nextInt();
	System.out.println(name+"의 사회 점수를 입력하세요");
	society = input.nextInt();
	System.out.println(name+"의 과학 점수를 입력하세요");
	science = input.nextInt();
	
	max = kor+eng+mass+society+science;
	average = max/5;
	
	System.out.println(name+"과목의 총 합은 : " +max);
	System.out.println(name+"과목의 총 평균은 : "+average);
	
	if (average >= 90)
	{
		System.out.println(name+" 의 성적은 A입니다");
	}
	
	else if (average >= 80)
	{
		System.out.println(name+" 의 성적은 B입니다");
	}
	
	else if (average >= 70)
	{
		System.out.println(name+" 의 성적은 C입니다");
	}
	
	else if (average >= 60)
	{
		System.out.println(name+" 의 성적은 D입니다");
	}
	else
	{
		System.out.println(name+" 의 성적은 F입니다");
	}
	
	System.out.println("이름을 입력해주세요");
	name2= input.next();
	
	System.out.println(name2+"의 국어 점수를 입력하세요");
	kor = input.nextInt();
	System.out.println(name2+"의 영어 점수를 입력하세요");
	eng = input.nextInt();
	System.out.println(name2+"의 수학 점수를 입력하세요");
	mass = input.nextInt();
	System.out.println(name2+"의 사회 점수를 입력하세요");
	society = input.nextInt();
	System.out.println(name2+"의 과학 점수를 입력하세요");
	science = input.nextInt();
	
	max = kor+eng+mass+society+science;
	average = max/5;
	
	System.out.println(name+"과목의 총 합은 : " +max);
	System.out.println(name+"과목의 총 평균은 : "+average);
	
	if (average >= 90)
	{
		System.out.println(name+" 의 성적은 A입니다");
	}
	
	else if (average >= 80)
	{
		System.out.println(name+" 의 성적은 B입니다");
	}
	
	else if (average >= 70)
	{
		System.out.println(name+" 의 성적은 C입니다");
	}
	
	else if (average >= 60)
	{
		System.out.println(name+" 의 성적은 D입니다");
	}
	else
	{
		System.out.println(name+" 의 성적은 F입니다");
	}
	
	System.out.println("이름을 입력해주세요");
	name3= input.next();
	
	System.out.println(name3+"의 국어 점수를 입력하세요");
	kor = input.nextInt();
	System.out.println(name3+"의 영어 점수를 입력하세요");
	eng = input.nextInt();
	System.out.println(name3+"의 수학 점수를 입력하세요");
	mass = input.nextInt();
	System.out.println(name3+"의 사회 점수를 입력하세요");
	society = input.nextInt();
	System.out.println(name3+"의 과학 점수를 입력하세요");
	science = input.nextInt();
	
	max = kor+eng+mass+society+science;
	average = max/5;
	
	System.out.println(name3+"과목의 총 합은 : " +max);
	System.out.println(name3+"과목의 총 평균은 : "+average);
	if (average >= 90)
	{
		System.out.println(name3+" 의 성적은 A입니다");
	}
	
	else if (average >= 80)
	{
		System.out.println(name3+" 의 성적은 B입니다");
	}
	
	else if (average >= 70)
	{
		System.out.println(name3+" 의 성적은 C입니다");
	}
	
	else if (average >= 60)
	{
		System.out.println(name3+" 의 성적은 D입니다");
	}
	else
	{
		System.out.println(name3+" 의 성적은 F입니다");
	}
	
}
}

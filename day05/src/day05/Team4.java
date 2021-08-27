package day05;

import java.util.Scanner;

public class Team4 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	/*과목번호를 입력받아 강의실번호를 출력!
과목은 1.수학 2.과학 3.영어 4.역사
1이면 "101호 입니다"
2면 "102호 입니다"
3이면 "203호 입니다"
4면 "204호 입니다"
나머지는 "상담원에게 문의 해주세요" 를 출력!
(ex. 5를 입력시 "상담원에게 문의 해주세요" 출력)*/
	
	int classNum;
	System.out.println("1.수학 2.과학 3.영어 4.역사");
	
	
	classNum = input.nextInt();
	
	
	if(classNum == 1)
	{
		System.out.println("101호입니다");
	}
	else if(classNum == 2)
	{
		System.out.println("102호입니다");
	}
	else if(classNum == 3)
	{
		System.out.println("203호입니다");
	}
	else if(classNum == 4)
	{
		System.out.println("204호입니다");
	}
	else
	{
		System.out.println("상담원에게 문의 해주세요");
	}
	
	
	
	
	//문제2. 숫자를 입력시 짝수,홀수를 구분하게끔 출력!
	//ex. 숫자를 입력하시오 >> 5 >>>홀수입니다
	
	int num;
	
	System.out.println("숫자를 입력하세요");
	
	num = input.nextInt();
	
	if (num%2 == 0)
	{
		System.out.println(num+"짝수입니다");
	}
	else 
	{
		System.out.println(num+"홀수입니다");
	}
	
	//문제3. 점수를 입력받아 점수가 90이상이면 A, 90미만 80이상이면 B, 80미만 70이상이면 C, 70미만 60이상이면 D, 그 미만이면 F 출력
	//ex. 점수를 입력하시오 >>> 90 >>> 당신은 A학점입니다.
	
	
	int exam = 0;
	System.out.println("시험점수를 입력하세요");
	
	exam = input.nextInt();
	
	if(exam >= 90)
	{
		System.out.println(exam+"당신의 시험점수는 A학점입니다");
	}
	else if(exam >= 80)
	{
		System.out.println(exam+"당신의 시험점수는 B학점입니다");
	}
	else if(exam >= 70)
	{
		System.out.println(exam+"당신의 시험점수는 C학점입니다");
	}
	else if(exam >= 60)
	{
		System.out.println(exam+"당신의 시험점수는 D학점입니다");
	}
	else
	{
		System.out.println(exam+"당신의 시험점수는 F학점입니다");
	}
	
	//문제4. 0~20까지 출력
	
	for(int i=0; i<=20; i++)
	{
	   System.out.print(" "+ i);
	}
	
	//문제5. 0~20까지 짝수만 출력
	System.out.println();
	for(int i=0; i<=20; i++)
	{
		if(i%2 == 0)
		{
			   System.out.print(" "+ i);
		}
	
	}
}
}

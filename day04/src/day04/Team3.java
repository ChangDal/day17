package day04;

import java.util.Scanner;

public class Team3 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		/*코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다. 

	    4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 

	    이를 판단하는 프로그램을 작성해보자.

	    점수가 0미만 100초과이면 경고문구 출력!
			*/
		
		int grade1, grade2, grade3, grade4;
		int result;
		
		
		System.out.println("1학년점수를 입력하세요");
		grade1 = input.nextInt();
		
		result = grade1;
		if (result >=60 && result != 0 && result <= 100)
		{
			System.out.println("합격");
		}
		else if(result < 0 || result > 100)
		{
			System.out.println("점수가 잘못 되었습니다.");
		}
		else {
			System.out.println("불합격");
		}
		
		System.out.println("2학년점수를 입력하세요");
		grade2 = input.nextInt();
		
		result = grade2;
		if (result >=60 && result != 0 && result <= 100)
		{
			System.out.println("합격");
		}
		
		else if(result < 0 || result > 100)
		{
			System.out.println("점수가 잘못 되었습니다.");
		}
		else {
			System.out.println("불합격");
		}
		
		System.out.println("3학년점수를 입력하세요");
		grade3 = input.nextInt();
		
		result = grade3;
		if (result >=60 && result != 0 && result <= 100)
		{
			System.out.println("합격");
		}
		
		else if(result < 0 || result > 100)
		{
			System.out.println("점수가 잘못 되었습니다.");
		}
		else {
			System.out.println("불합격");
		}
		
		System.out.println("4학년 점수를 입력하세요");
		grade4 = input.nextInt();
		
		result = grade4;
		if (result >=70 && result != 0 && result <= 100)
		{
			System.out.println("합격");
		}
		
		else if(result < 0 || result > 100)
		{
			System.out.println("점수가 잘못 되었습니다.");
		}
		else {
			System.out.println("불합격");
		}
		
		
				
			
				
	}
}

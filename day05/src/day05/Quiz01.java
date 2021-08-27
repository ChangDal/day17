package day05;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	int day;
    System.out.println("날짜 입력: ");
    day = input.nextInt();
    day = day%7;
    switch(day)
    {

    case 1: System.out.println("월요일");break;
    case 2: System.out.println("화요일");break;
    case 3: System.out.println("수요일");break;
    case 4: System.out.println("목요일");break;
    case 5: System.out.println("금요일");break;
    case 6: System.out.println("토요일");break;
    case 0: System.out.println("일요일");break;
    }
    
	String home = null;
	String company = null;
	
	
	int select = 0;
	
	while(true)
	
	{
	
		System.out.println("1.우리집 등록");
		System.out.println("2.회사 등록");
		System.out.println("3.등록 보기");
		
		select = input.nextInt();
		
		switch(select) 
		{
		case 1: home = input.next();
		System.out.println("등록 성공"); break;
		case 2: company = input.next();
		System.out.println("등록 성공"); break;
		case 3: System.out.println("우리집은 "+home);
		System.out.println("회사는 "+company);
		}
	
}
}
}



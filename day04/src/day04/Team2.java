package day04;

import java.util.Scanner;

public class Team2 {
public static void main(String[] args)
{
	/*
	 * 2. x축 y축에 따른 사분면 구하기 
	(0,0) 영점에 위치한거 및  (0,5) 등 어느 분면에도 속하지않을때도 포함
	 */
	Scanner input = new Scanner(System.in);
	
	int x=0,y=0;
	System.out.println("x축을 입력하세요");
    x = input.nextInt();
	System.out.println("y축을 입력하세요");
    y = input.nextInt();
    
    
    if (x == 0 && y == 0)
    {
    	System.out.println("("+x+","+y+" ) 0점에 위치해 있습니다");
    
    }
    else if(x >= 0 && y >= 0 && y != 0 && x != 0)
    {
    	System.out.println("("+x+","+y+")제 1사분면입니다");
    }
    else if(x < 0 && y >= 0 && y != 0 && x != 0)
    {
    	System.out.println("("+x+","+y+")제 2사분면입니다");
    }
    else if(x < 0 && y <0 && y != 0 && x != 0)
    {
    	System.out.println("("+x+","+y+")제 3사분면입니다");
    } 
    else if(x >= 0 && y < 0 && y != 0 && x != 0)
    {
    	System.out.println("("+x+","+y+")제 4사분면입니다");
    }
    else
    {
    	System.out.println("어느곳에도 속하지 않습니다");
    }

    
}
}

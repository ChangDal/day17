package day04;

import java.util.Scanner;

public class Team2 {
public static void main(String[] args)
{
	/*
	 * 2. x�� y�࿡ ���� ��и� ���ϱ� 
	(0,0) ������ ��ġ�Ѱ� ��  (0,5) �� ��� �и鿡�� �������������� ����
	 */
	Scanner input = new Scanner(System.in);
	
	int x=0,y=0;
	System.out.println("x���� �Է��ϼ���");
    x = input.nextInt();
	System.out.println("y���� �Է��ϼ���");
    y = input.nextInt();
    
    
    if (x == 0 && y == 0)
    {
    	System.out.println("("+x+","+y+" ) 0���� ��ġ�� �ֽ��ϴ�");
    
    }
    else if(x >= 0 && y >= 0 && y != 0 && x != 0)
    {
    	System.out.println("("+x+","+y+")�� 1��и��Դϴ�");
    }
    else if(x < 0 && y >= 0 && y != 0 && x != 0)
    {
    	System.out.println("("+x+","+y+")�� 2��и��Դϴ�");
    }
    else if(x < 0 && y <0 && y != 0 && x != 0)
    {
    	System.out.println("("+x+","+y+")�� 3��и��Դϴ�");
    } 
    else if(x >= 0 && y < 0 && y != 0 && x != 0)
    {
    	System.out.println("("+x+","+y+")�� 4��и��Դϴ�");
    }
    else
    {
    	System.out.println("��������� ������ �ʽ��ϴ�");
    }

    
}
}

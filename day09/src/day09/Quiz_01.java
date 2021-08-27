package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Quiz_01 {
public static void main(String[] args)
{
	LinkedHashMap map = new LinkedHashMap();
	Scanner input = new Scanner(System.in);
	
	int select = 0;
	int temp=0;
	while(true)
	{
		System.out.println("1. 메뉴 등록");
		System.out.println("2. 메뉴별 가격 보기");
		System.out.println("3. 종 료");
		System.out.println(">>>");
		
		select = input.nextInt();
		
		switch(select)
		{
	
		
		case 1:
		
			System.out.println("메뉴 입력");
			String menu = input.next();
			
			System.out.println("가격 입력");
			int price = input.nextInt();
			
			temp = price;
			
			if(map.containsKey(menu))
			{
				
				System.out.println("중복되었습니다.다시입력하세요");
				continue;
			}
		
			else
			{
				map.put(menu, price);
				System.out.println("등록되었습니다.");	
			}
			
			break;
			
		case 2:
			
			Iterator it = map.keySet().iterator();
			while(it.hasNext())
			{
				String key =  (String)it.next();
				System.out.println(key + " : "+map.get(key));
			}
			
			if(map.isEmpty())
			{
				System.out.println("메뉴가 없습니다");
			}
			
			else
			{
				
			
			System.out.println("1.수정 2.삭제 3.나가기");
			System.out.println(">>>");
			int select2=0;
			select2 = input.nextInt();
			
			switch(select2)
			{
			case 1:
				
				System.out.println("변경 메뉴이름 입력 : ");
				String ChangeMenu = input.next();
				
				if(map.containsKey(ChangeMenu))
				{
					
				
					System.out.println("수정 가격 입력 : ");
					int ChangePrice = input.nextInt();
			
					map.put(ChangeMenu, ChangePrice);
					
					System.out.println(temp+"->"+map.get(ChangeMenu));
					
					System.out.println("변경되었습니다!!");
				}
				
				else
				{
					System.out.println("메뉴가 없습니다!!!");
					continue;
				}
				
				break;
				
			case 2:
				
				System.out.println("삭제할 메뉴를 입력하세요");
				String x =  input.next();
				if(map.containsKey(x))
				{
					map.remove(x);
				}
				else
					System.out.println("메뉴가 없습니다.");
			
			
				
			break;
			
			case 3:
			break;
			
			}
			}
			
			break;
			
		    case 3:
			break;
		
		}
	}
	
	}

}


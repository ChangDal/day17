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
		System.out.println("1. �޴� ���");
		System.out.println("2. �޴��� ���� ����");
		System.out.println("3. �� ��");
		System.out.println(">>>");
		
		select = input.nextInt();
		
		switch(select)
		{
	
		
		case 1:
		
			System.out.println("�޴� �Է�");
			String menu = input.next();
			
			System.out.println("���� �Է�");
			int price = input.nextInt();
			
			temp = price;
			
			if(map.containsKey(menu))
			{
				
				System.out.println("�ߺ��Ǿ����ϴ�.�ٽ��Է��ϼ���");
				continue;
			}
		
			else
			{
				map.put(menu, price);
				System.out.println("��ϵǾ����ϴ�.");	
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
				System.out.println("�޴��� �����ϴ�");
			}
			
			else
			{
				
			
			System.out.println("1.���� 2.���� 3.������");
			System.out.println(">>>");
			int select2=0;
			select2 = input.nextInt();
			
			switch(select2)
			{
			case 1:
				
				System.out.println("���� �޴��̸� �Է� : ");
				String ChangeMenu = input.next();
				
				if(map.containsKey(ChangeMenu))
				{
					
				
					System.out.println("���� ���� �Է� : ");
					int ChangePrice = input.nextInt();
			
					map.put(ChangeMenu, ChangePrice);
					
					System.out.println(temp+"->"+map.get(ChangeMenu));
					
					System.out.println("����Ǿ����ϴ�!!");
				}
				
				else
				{
					System.out.println("�޴��� �����ϴ�!!!");
					continue;
				}
				
				break;
				
			case 2:
				
				System.out.println("������ �޴��� �Է��ϼ���");
				String x =  input.next();
				if(map.containsKey(x))
				{
					map.remove(x);
				}
				else
					System.out.println("�޴��� �����ϴ�.");
			
			
				
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


package day08_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
	
	ArrayList addressName = new ArrayList();
	ArrayList addressContract = new ArrayList();
	
	int select = 0;
	String name = null;
	String address = null;
	String temp = null;

	
	while(true)
	{
		System.out.println("1. ����ó ���");
		System.out.println("2. ����ó ����");
		System.out.println("3. ����ó ����");
		System.out.println("4. ��� ����ó ����");
		System.out.println("5. ����");
		
		select = input.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("�̸� �Է�");
			name= input.next()+"";
			
			if(addressName.contains(name))
			{
				System.out.println("�ߺ��� �̸��Դϴ�");
				continue;
			}
			
			else
			{
				addressName.add(name);
			}
	

			
			System.out.println("����ó �Է�");
			address = input.next()+"";
		
				if(addressContract.contains(address))
				{
					System.out.println("�ߺ��� ����ó �Դϴ�");
					continue;
				}
				
				else
				{
					addressContract.add(address);
				}
			
			
			break;
			
		case 2:
			
			System.out.println("ã�� �̸� �Է�");
			temp = input.next()+"";
			
			if(addressName.contains(temp))
			{
				 
			for(int i=0; i<addressName.size(); i++)
			{
			   
				   System.out.print(i+"."+addressName.get(i)+ "\t");
				   System.out.println(i+"."+addressContract.get(i)); 
			   
				
			}
			}
			
			else
			{
				System.out.println("����ó ��Ͽ��� ã�� �� �����ϴ�.");
			}
			
			break;
			
		case 3:
		
			
			System.out.println("������ �̸��� �Է��ϼ���");
			String temp1 = input.next()+"";
		
			
			if(addressName.contains(temp1))
			{
				int x = addressName.indexOf(temp1);
				
				addressName.remove(x);
				addressContract.remove(x);
				
			
			}
			
			else
			{
			 System.out.println("");
			}
		
		
			
			
			
			break;
			
		case 4:
			
			for(int i = 0; i<addressName.size(); i++)
			{
				 System.out.println(i+"."+addressName.get(i)+" "+ addressContract.get(i));
				 System.out.println();
			}
		 
		
		    break;
		    
		case 5:
			System.out.println("�����մϴ�");
			break;
			
			
		}
		
	}
	}
}




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
		System.out.println("1. 연락처 등록");
		System.out.println("2. 연락처 보기");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 모든 연락처 보기");
		System.out.println("5. 종료");
		
		select = input.nextInt();
		
		switch(select)
		{
		case 1:
			System.out.println("이름 입력");
			name= input.next()+"";
			
			if(addressName.contains(name))
			{
				System.out.println("중복된 이름입니다");
				continue;
			}
			
			else
			{
				addressName.add(name);
			}
	

			
			System.out.println("연락처 입력");
			address = input.next()+"";
		
				if(addressContract.contains(address))
				{
					System.out.println("중복된 연락처 입니다");
					continue;
				}
				
				else
				{
					addressContract.add(address);
				}
			
			
			break;
			
		case 2:
			
			System.out.println("찾을 이름 입력");
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
				System.out.println("연락처 목록에서 찾을 수 없습니다.");
			}
			
			break;
			
		case 3:
		
			
			System.out.println("삭제할 이름을 입력하세요");
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
			System.out.println("종료합니다");
			break;
			
			
		}
		
	}
	}
}




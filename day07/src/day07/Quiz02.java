package day07;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
	// 1�α��� 2 ȸ������ 3������ �����
	
	String ID=null, PW=null;
	String newID=null, newPW=null;
	
	while(true)
	{
		System.out.println("1.�α��� 2. ȸ������ 3.������ ");
	System.out.println(">>>");
	int select = input.nextInt();

	 if(select < 1 || select >= 4)
	 {
		 System.out.println("���� �ٽ� �Է�!");
		 continue;
	 }
	  if(select == 1)
	 {
		 System.out.println("���̵� �Է� : ");
		 ID = input.next();
		 System.out.println("��й�ȣ �Է� : ");
		 PW = input.next();
		 
		 if(ID.equals(newID) == true && PW.equals(newPW) == true)
		 {
			 System.out.println("�α��� ����");
		 }
		 else
		 {
			 System.out.println("���� ����!");
		 }
		 
		 
	 }
	 
	   if(select == 2)
	 {
		 System.out.println("������ ���̵� �Է� : ");
		 newID = input.next();
		 System.out.println("������ ��й�ȣ �Է� : ");
		 newPW = input.next();
	 }
	   if(select == 3)
	 {
		 break;
	 }
	 
	 
		
		
	}
	}
	
}
package day13_this_setget;


import java.util.*;

public class Quiz_Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num=0,result=0; String inputId=null,inputPw=null;
		Quiz_Login lo = new Quiz_Login(); boolean flag=true;
		while(flag){
			System.out.print("1.�α���  2.�� ��  3.�α׾ƿ� \n>>>"); num = input.nextInt();
			switch(num){
			case 1:System.out.print("���̵� �Է� : ");inputId = input.next();
			System.out.print("��й�ȣ �Է� : "); inputPw = input.next();
			result = lo.compare(inputId,inputPw);
			if(result == 0) System.out.println("���� ���");
			else  System.out.println("���� ����");
			break;
			case 2: System.out.print("���� id : "); inputId = input.next();
			System.out.print("���� pw : "); inputPw = input.next();
			lo.setUserId(inputId);
			lo.setUserPw(inputPw);
			System.out.println("���� �Ϸ�");
			break;
			case 3:flag=lo.out();System.out.println("���� �մϴ�");
			}
		}
	}

}


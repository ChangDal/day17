package day09;

public class Ex07 {
public static void main(String[] args)
{
	String  str = "   Have a nice day   ";
	String result  = str.trim(); //��U�� ������ ���ִ� ����
	System.out.println("1. "+str+"...");
	System.out.println("2. "+result+"...");
	
	
	
	String[] splitStr = result.split(" ");
	//Ư�� ���� �������� �ڸ��ڴٴº���
	for(int i = 0 ; i<splitStr.length; i++)
	{
		System.out.println(i+"."+splitStr[i]);
	}
	
	String DBAddr = "02852/����Ư����/���α�/����1234-567";
			splitStr = DBAddr.split("/");
			for(int i = 0 ; i<splitStr.length; i++)
			{
				System.out.println(i+"."+splitStr[i]);
			}
			//�տ� ���� �ڿ� ������ ��ȯ�ϴ°� 
			String replace = result.replace(" ", "==");
			System.out.println(replace);
	
}
}

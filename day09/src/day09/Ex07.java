package day09;

public class Ex07 {
public static void main(String[] args)
{
	String  str = "   Have a nice day   ";
	String result  = str.trim(); //양쪾에 공백을 없애는 변수
	System.out.println("1. "+str+"...");
	System.out.println("2. "+result+"...");
	
	
	
	String[] splitStr = result.split(" ");
	//특정 값을 기준으로 자르겠다는변수
	for(int i = 0 ; i<splitStr.length; i++)
	{
		System.out.println(i+"."+splitStr[i]);
	}
	
	String DBAddr = "02852/서울특별시/종로구/지번1234-567";
			splitStr = DBAddr.split("/");
			for(int i = 0 ; i<splitStr.length; i++)
			{
				System.out.println(i+"."+splitStr[i]);
			}
			//앞에 값을 뒤에 값으로 변환하는거 
			String replace = result.replace(" ", "==");
			System.out.println(replace);
	
}
}

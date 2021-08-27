package day02_변수_연산자;

import java.io.IOException;

public class Quiz03 {
	public static void main(String[] args) throws IOException {
		int num;
		System.out.print("문자 입력 : ");
		num = System.in.read();
		
		System.out.println("==== 출력 ====");
System.out.println("입력하신 문자 : "+(char)num);
System.out.println("입력하신 문자 : "+(char)(num+32));
System.out.println("------------------------");
System.in.read();System.in.read();
		System.out.println("값 입력 : ");
		num = System.in.read();
		System.out.println("==== 출력 ====");
	System.out.println("입력하신 값 : "+(char)num);
		System.out.println("변환 후 값 : "+( num - 48 ));

	}
}






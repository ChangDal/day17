package day02_변수_연산자;

public class Ex02 {
	public static void main(String []args) {
		int num = 123;
		char ch = 'D';
		
		System.out.println(num);
		System.out.println((char)num);
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println("===============");
		
		num = num + 10;
		ch = 'G';
		System.out.println("num : "+num);
		System.out.println("ch : "+ch);
		
		ch = 'A';
		num = 5;
		System.out.println("확인 : "+ch);
		System.out.println("확인 : "+num);
		
		int ret;
		ret = ch + num;
		System.out.println("결과 : "+ret);
		System.out.println("결과 : "+(char)ret);
	}
}







package day02_����_������;

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
		System.out.println("Ȯ�� : "+ch);
		System.out.println("Ȯ�� : "+num);
		
		int ret;
		ret = ch + num;
		System.out.println("��� : "+ret);
		System.out.println("��� : "+(char)ret);
	}
}







package day13_this_setget;

public class Ex02_Main {
	public static void main(String[] args) {
		Ex02_private ex = new Ex02_private();
		//ex.num = 12345;
		ex.setNum(123456);
		ex.printNum();
		
		int number = ex.getNum();
		System.out.println("main num : "+number);
	}
}

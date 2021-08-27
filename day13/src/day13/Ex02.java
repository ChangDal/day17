package day13;

public class Ex02 {
public static void main(String[] args) {
	Ex02_private ex = new Ex02_private();
	ex.printNum();
	ex.setting(123456);
	ex.printNum();
	
	int number = ex.getNum();
	System.out.println(number);
}
}

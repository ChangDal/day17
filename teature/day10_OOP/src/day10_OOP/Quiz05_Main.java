package day10_OOP;

public class Quiz05_Main {
	public static void main(String[] args) {
		Quiz05_절대값 quiz05 = new Quiz05_절대값();
		int n = quiz05.input();
		int abs = n;
		abs = quiz05.abs(abs);
		quiz05.print(abs, n);
		
	}
}




package day15_constructor;

public class Ex06 {
	public static void main(String[] args) {
		Singleton06 si = Singleton06.getInstance(); //new Singleton06();
		Singleton06 si1 = Singleton06.getInstance(); //new Singleton06();
		Singleton06 si2 = Singleton06.getInstance(); //new Singleton06();
		System.out.println(si);
		System.out.println(si1);
		System.out.println(si2);
	}
}

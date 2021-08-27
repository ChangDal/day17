package day15_constructor;

public class Singleton06 {
	private static Singleton06 si;
	private Singleton06() {
		System.out.println("기본 생성자");
	}
	public static Singleton06 getInstance() {
		if(si == null)
			si = new Singleton06();
		return si;
	}
}

package day12_ClassVariable;

public class Variable02 {
	public int cnt = 10;
	public void test1() {
		System.out.println("test1 : "+cnt);
		cnt = 12345;
	}
	public void test2() {
		System.out.println("test2 : "+cnt);
	}
}

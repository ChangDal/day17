package day11_Over_Rand;
class OverLoading01{
	public int sumFunc(int su1, int su2) {
		return su1+su2;
	}
	public int sumFunc(int su1) {
		return su1+12345;
	}
	public String sumFunc(String s1, String s2) {
		return s1+s2;
	}
}
public class Ex01_Overloading {
	public static void main(String[] args) {
		/*
		 오버로딩
		 - 메소드의 이름을 동일하게 만드는 것
		 - 단, 매개변수(아규먼트)의 개수 또는 타입이 달라야 된다.
		 */
		OverLoading01 over = new OverLoading01();
		System.out.println("두 수의 합 : " + over.sumFunc(10, 20) );
		System.out.println("두 문자 합 : " + over.sumFunc("ㅁㅁ", "ㅠㅠ") );
		System.out.println(" 합 : " + over.sumFunc(10) );
	}
}







package day10_OOP;

public class Member03 {
	public double avrg(int s1, int s2) {
		//System.out.println(s1+", "+s2);
		double avr = (s1+s2) / 2.0;
		return avr;
	}
	public void print(int a, int b, double c) {
		System.out.println(a+"¿Í "+b+"ÀÇ Æò±Õ : "+c);
		print02(100, 200, 150.0);
	}
	private void print02(int a, int b, double c) {
		System.out.println(a+"¿Í "+b+"ÀÇ Æò±Õ : "+c);
	}
}





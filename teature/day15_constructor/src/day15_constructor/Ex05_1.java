package day15_constructor;

import java.util.Calendar;

public class Ex05_1 {
	public static void main(String[] args) {
		
		Singleton s01 = new Singleton("È«±æµ¿");
		Singleton s02 = s01;
		s02.setName("±è°³¶Ë");
		System.out.println(s01.getName());
		System.out.println(s02.getName());
		
		System.out.println(s01);
		System.out.println(s02);
	}
}

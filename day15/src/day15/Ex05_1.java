package day15;

import java.util.Calendar;

public class Ex05_1 {
	public static void main(String[] args) {
		Constructor03.test = 4444;
		Calendar.getInstance();
		Singleton s01 = new Singleton("ȫ�浿");
		Singleton s02 = s01;
		s02.SetName("�谳��");
		System.out.println(s01.GetName());
		System.out.println(s02.GetName());
		
		System.out.println(s01);
		System.out.println(s02);
		
	}
	
	
}

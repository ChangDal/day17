package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		for(int i=0; i<3;i++) {
			Date date = new Date();
			System.out.println( simple.format(date) );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

package day14;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01시간설정 {
public static void main(String[] args) {
	long time = System.currentTimeMillis();
	System.out.println(time);
	
	SimpleDateFormat simp = 
			new SimpleDateFormat("yyyy-MM-dd일 aa hh시 mm분 ss초");
	
			String s = simp.format(time);
			System.out.println(s);
			
			Date date = new Date();
			System.out.println(date);
			System.out.println(simp.format(date));
			
			Calendar cal = Calendar.getInstance();
			System.out.println(cal);
			System.out.println(cal.getWeekYear());
			
		System.out.println(simp.format(cal.getTimeInMillis()));
		System.out.println(cal.get(Calendar.MONTH));
		
		
			
}
}

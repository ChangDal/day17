package quiz;

public class Quiz04 {
	public static void main(String[] args) {
		int rice = 100000, mouse = 2, day=1;
		for( ; rice > 0 ; day++ ) {
			rice -=  mouse * 20;
			if(day % 10 == 0) {
				mouse *= 2;
			}
			//System.out.println("rice : "+rice+", day : "+day);
		}
		day--;
		System.out.println(day+"¿œ "+mouse+"∏∂∏Æ");
	}
}

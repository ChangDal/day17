package quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int won=0;
		for(int day=1; day <= 30 ; day++) {
			if(day == 1) {
				won = 1;
				System.out.println("첫째날 : "+won + "원");
			}
			else {
				won *= 2;
				System.out.println(day+" : "+won+ "원");
			}
		}
	}
}

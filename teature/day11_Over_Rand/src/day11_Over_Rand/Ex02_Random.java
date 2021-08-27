package day11_Over_Rand;

public class Ex02_Random {
	public static void main(String[] args) {
		for(int i=0; i<5 ; i++) {
			//double rand = Math.random() * 3 ;
			int rand = (int)(Math.random() * 3 + 10) ;
			System.out.println(rand);
		}
	}
}

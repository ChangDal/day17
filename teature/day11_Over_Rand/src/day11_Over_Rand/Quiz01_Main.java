package day11_Over_Rand;

import java.util.ArrayList;

public class Quiz01_Main {
	public static void main(String[] args) {
		Quiz01_Random random = new Quiz01_Random();
		ArrayList arr = random.arrayLotto();
		System.out.println("mainÃâ·Â : "+arr);
		
		System.out.println("main set : "+random.setLotto() );
	}
}




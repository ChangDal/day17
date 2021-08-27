package day05_switch_for;

public class Quiz03_for {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			System.out.println(i+".Hello");
		}
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
			//System.out.println(i+" : "+sum);
			if(sum == 528)
				System.out.println(i);
		}
		for(int i=1;i<=25;i++) {
			System.out.print(i + " ");
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}
}

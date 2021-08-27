package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		int sum=0, sum02=0;
		for(int i=1;i<=1000;i++) {
			sum += i;
			if(i % 3 == 0 && i % 5 != 0) {
				sum02 += i;
			}
		}
		System.out.println(sum - sum02);
	}
}

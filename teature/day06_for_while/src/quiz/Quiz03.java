package quiz;

public class Quiz03 {
	public static void main(String[] args) {
		int sum = 0, i;
		for( i=1; sum < 10000; i++ ) {
			if(i%2 == 1) {
				sum+=i;
				System.out.println("sum : "+sum+", i : "+i);
			}
		}
		i--;
		System.out.println("-----------------");
		System.out.println("i : "+ i);
	}
}

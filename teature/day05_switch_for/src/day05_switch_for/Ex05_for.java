package day05_switch_for;

public class Ex05_for {
	public static void main(String[] args) {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("-------------");
		for(int i=1; i<= 10 ; i=i+2) { // i++
			System.out.println(i);
		}
		System.out.println("--------------");
		
		int su, evenSum=0, oddSum=0, sum=0;
		for(su=1; su<=10;su++) {
			sum += su; // sum = sum + su;
			if(su % 2 == 0 ) {
				evenSum += su;
				System.out.println("¦�� : "+su);
			}else {
				oddSum += su;
				System.out.println("Ȧ�� : "+su);
			}
			//sum += su;
		}
		//1 ~ 10 : ¦��(30), Ȧ��(25)�� �� �׸��� ����(55)
		System.out.println(evenSum+","+oddSum+","+sum);
		System.out.println("---------------");
		
		su = 1; sum = 0;
		for( ; su <= 10 ; ) {
			sum += su;
			su++;
		}
		System.out.println("1~10 �� : "+sum);
		
		for( ; ; ) {
			System.out.println("����");
		}
	}
}







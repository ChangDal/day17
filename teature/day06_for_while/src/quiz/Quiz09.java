package quiz;

public class Quiz09 {
	public static void main(String[] args) {
		/*
 1~1000���̿� �ִ� �ڿ����� ���Ͽ� �ڱ� �ڽ��� ���� ������ ��� ����� ���� �ڽŰ� �������� ��
 (������)�� ���Ͽ���.
��) 6�� ��� = 1, 2, 3, 6
1+2+3 = 6(������)
	6, 20����, 400����
		 */
		int sum=0;
		for(int i=2; i < 1000; i++) {
			for(int j=1; j < i ; j++) {
				if(i%j == 0 ) {
					sum += j;
				}
			}
			if(sum == i) {
				System.out.println("���� �� : "+sum);
			}
			sum = 0;
		}
	}
}









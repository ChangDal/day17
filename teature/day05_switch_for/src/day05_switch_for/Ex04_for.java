package day05_switch_for;

public class Ex04_for {
	public static void main(String[] args) {
		/*
		 	for(�ʱⰪ ; ���ǽ� ; ������ ){
		 		���ӹ���
		 	}
		 	�ݺ��� ��� ����
		 	1. ��Ģ���� ���� ������ ���� �� �ݺ��� ��� ����
		 */
		int sum = 0, num = 1;
		sum = sum + 1;//num; num++;
		sum = sum + 2;//num; num++;
		sum = sum + 3;//num; num++;
		sum = sum + 4;//num; num++;
		sum = sum + 5;//num; num++;
		sum = sum + 6;//num; num++;
		sum = sum + 7;//num; num++;
		sum = sum + 8;//num; num++;
		sum = sum + 9;//num; num++;
		sum = sum + 10;//num;
		System.out.println(sum);
		
		sum = 0;
		for( num = 1 ; num <= 10  ; num = num + 1 ){
			sum = sum + num;
			//System.out.println(num);
	 	}
		System.out.println("�ι�° sum : "+sum);
		System.out.println("���� ����� ����");
	}
}















package day14_class;

public class Ex02 {
	public static void main(String[] args) {
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���α׷� ����");
	}
}
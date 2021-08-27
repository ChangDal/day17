package day14;

public class Ex02슬립천천히반복문실행 {

	public static void main(String[] args) {
		for(int i =0; i <10; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		System.out.println("프로그램 종료");
		
	}
}

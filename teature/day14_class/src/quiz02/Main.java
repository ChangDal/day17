package quiz02;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.타임 클래스 사용");
			System.out.println("2.윈7 클래스 사용");
			System.out.println("3.종료");
			System.out.print(">>>  ");
			num = input.nextInt();
			switch(num) {
			case 1:
				TimerQuiz time = new TimerQuiz();
				time.time();
				break;
			case 2:
				Win7Quiz win = new Win7Quiz();
				win.display();
				break;
			case 3:
				System.out.println("프로그램 종료 합니다!!!");
				System.exit(0);
			}
		}
	}
}


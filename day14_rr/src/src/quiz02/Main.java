package quiz02;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.Ÿ�� Ŭ���� ���");
			System.out.println("2.��7 Ŭ���� ���");
			System.out.println("3.����");
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
				System.out.println("���α׷� ���� �մϴ�!!!");
				System.exit(0);
			}
		}
	}
}


package day10_OOP;

public class Quiz03_3의배수 {
	public boolean op(int num) {
		boolean bool = true;
		if(num % 3 == 0) {
			bool = true;
		}else {
			bool = false;
		}
		return bool;
	}
	public void print(boolean bool) {
		if(bool) {
			System.out.println("입력 값은 3의 배수 입니다");
		}else {
			System.out.println("입력 값은 3의 배수 아닙니다");
			
		}
	}
}





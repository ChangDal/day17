package day06_for_while;

public class TestClass {
	public static void main(String[] args) {
		int num = 1, nextLine = 1, condition = 2;
		for (int i = 1; i <= 15; i++) {
			if (num == nextLine) {
				System.out.print(num++ + "\n");
				nextLine = nextLine + condition;
				condition = condition + 1;
			} else {
				System.out.print(num++ +"\t");
			}
		}
	}
}

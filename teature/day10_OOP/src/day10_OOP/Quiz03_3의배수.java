package day10_OOP;

public class Quiz03_3�ǹ�� {
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
			System.out.println("�Է� ���� 3�� ��� �Դϴ�");
		}else {
			System.out.println("�Է� ���� 3�� ��� �ƴմϴ�");
			
		}
	}
}





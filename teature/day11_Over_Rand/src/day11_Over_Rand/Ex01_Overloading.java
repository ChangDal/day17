package day11_Over_Rand;
class OverLoading01{
	public int sumFunc(int su1, int su2) {
		return su1+su2;
	}
	public int sumFunc(int su1) {
		return su1+12345;
	}
	public String sumFunc(String s1, String s2) {
		return s1+s2;
	}
}
public class Ex01_Overloading {
	public static void main(String[] args) {
		/*
		 �����ε�
		 - �޼ҵ��� �̸��� �����ϰ� ����� ��
		 - ��, �Ű�����(�ƱԸ�Ʈ)�� ���� �Ǵ� Ÿ���� �޶�� �ȴ�.
		 */
		OverLoading01 over = new OverLoading01();
		System.out.println("�� ���� �� : " + over.sumFunc(10, 20) );
		System.out.println("�� ���� �� : " + over.sumFunc("����", "�Ф�") );
		System.out.println(" �� : " + over.sumFunc(10) );
	}
}







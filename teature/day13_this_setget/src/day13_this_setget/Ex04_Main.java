package day13_this_setget;

public class Ex04_Main {
	public static void main(String[] args) {
		int k=100,e=90,m=80;
		// 객체 생성후 각각의 값(kor,eng,math,sum,avg)을 저장하세요
		// 출력하세요. 국,영,수,합,평균
		Ex04_private ex = new Ex04_private();
		ex.setKor(k); ex.setEng(e); ex.setMath(m);
		ex.setSum(k+e+m);
		ex.setAvg( ex.getSum() / 3.0 );
		System.out.println(ex.getKor());
		System.out.println(ex.getEng());
		System.out.println(ex.getMath());
		System.out.println(ex.getSum());
		System.out.println(ex.getAvg());
	}
}

package day13;

public class Ex01 {
public static void main(String[] args) {
	/*
	 - 객체 인스턴스  자기자신의 정보를 가지고있는 변수
	 - 멤버 변수 또는 메소드에 접근하기 위해서 사용한다.
	 */
	Ex01_this ex = new Ex01_this();
	ex.func();
	ex.func02();
	System.out.println(ex);
	//this는 가장 최상위 코드로 올라가서 변수를 찾는다 
}
}

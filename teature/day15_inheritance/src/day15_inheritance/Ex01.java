package day15_inheritance;
class Calc{
	public void display() {
		System.out.println("나는 계산기야");
	}
}
class Computer extends Calc{
	public void print() {
		System.out.println("나는 컴퓨터야");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		//Calc calc = new Calc();
		//calc.display();
		Computer com = new Computer();
		com.print();
		com.display();
	}
}






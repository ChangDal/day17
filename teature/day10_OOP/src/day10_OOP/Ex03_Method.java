package day10_OOP;

public class Ex03_Method {
	public static void main(String[] args) {
		Member03 mem = new Member03();
		int su1 = 10, su2 = 20;
		double d = mem.avrg(su1, su2);
		mem.print(su1, su2, d);
		//mem.print02(su1,su2,d);
	}
}




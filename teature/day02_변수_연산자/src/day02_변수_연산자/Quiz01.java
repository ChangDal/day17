package day02_변수_연산자;

public class Quiz01 {
	public static void main(String[] args) {
		byte b = 97; // 1byte
		short s = 20; //2byte
		char c = 'A'; // 2byte
		float f; // 4byte

		s = b;
		c = (char)b;
		s = (short)c;
		c = (char)s;
		f = (float)5.11;
		f = 5.11f;


	}
}

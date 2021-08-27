package day10_OOP;

public class Quiz06_Main {
	public static void main(String[] args) {
		//String result="";
		//System.out.println(result+1+2+3);
		Quiz06_rev quiz06 = new Quiz06_rev();
		int su = quiz06.input();
		String r = quiz06.reverse(su);
		quiz06.print(su,r);

		quiz06.print02(su, quiz06.reverse02(su));
		
	}
}








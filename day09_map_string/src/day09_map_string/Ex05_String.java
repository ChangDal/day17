package day09_map_string;

public class Ex05_String {
	public static void main(String[] args) {
		String str = "Java is Easy. �׸��� programming �Ҹ��ϴ�";
		System.out.println("�⺻ : "+str);
		//String changeStr = new String();
		String changeStr;
		changeStr = str.toUpperCase();
		System.out.println("��ȯ : "+changeStr);
		changeStr = str.toLowerCase();
		System.out.println("��ȯ : "+changeStr);
	}
}

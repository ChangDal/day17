package day09_map_string;

public class Ex07_String {
	public static void main(String[] args) {
		String str = " Have a nice day   ";
		String result = str.trim();
		System.out.println("1."+str+"...");
		System.out.println("2."+result+"...");
		
		String inputId = "abc123    ";
		String saveId = "abc123";
System.out.println("����� �Է� id : "+inputId+".");
System.out.println("DB���� id : "+saveId+".");
System.out.println("����� �Է� id : "+inputId.length() );
System.out.println("DB���� id : "+saveId.length() );
System.out.println(inputId.trim().equals(saveId));


		String[] splitStr = result.split(" ");
		for(int i=0 ; i<splitStr.length ; i++) {
			System.out.println( i+"."+splitStr[i] );
		}
String DBAddr = "02852/����Ư����/���α�/����5284-458";
		splitStr = DBAddr.split("/");
		for(int i=0 ; i<splitStr.length ; i++) {
			System.out.println( i+"."+splitStr[i] );
		}
		
		String replace = result.replace(" ", "==");
		System.out.println(replace);
	}
}











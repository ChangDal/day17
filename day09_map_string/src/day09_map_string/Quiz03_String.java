package day09_map_string;


public class Quiz03_String {
	public static void main(String [] args){
		
		String str = new String("Have a nice day Have a nice day Have a nice day");
		int i=0;
		ArrayList arr = new ArrayList();
		while(i < str.length()) {
			if(str.charAt(i) == 'a')
				arr.add(i);
			i++;
		}
		System.out.println(arr);
	
		
	
		String str = new String("It is a fun java programming");
		int i=0;
		int cnt_a=0,cnt_g=0,cnt=0;
		while(i < str.length()) {
			if(str.charAt(i) == 'a')
				cnt_a++;
			else if(str.charAt(i) == 'g')
				cnt_g++;
			i++;
		}
		System.out.println("총 개수 : "+str.length());
		System.out.println("a 개수 : "+cnt_a);
		System.out.println("g 개수 : "+cnt_g);

	
		String str = new String("tESt  sTring  change   first");
		String changeStr = new String();
		int i=0;

		str = str.toLowerCase();
		if(str.charAt(0) >='a' && str.charAt(0) <='z') {
			changeStr+=(char)(str.charAt(i)-32);
			i++;
		}
		while(i<str.length()) {
			if(str.charAt(i) != ' ') {
				changeStr+=str.charAt(i);
				i++;
				continue;
			}
			+
			while(str.charAt(i) == ' ') {
				changeStr+=str.charAt(i);
				i++;
			}
			if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
				changeStr+=(char)(str.charAt(i)-32);
			i++;
		}
		System.out.println(str);
		System.out.println(changeStr);
		System.out.println("종료");
		
	}

}

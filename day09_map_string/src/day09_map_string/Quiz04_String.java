package day09_map_string;

public class Quiz04_String {
	public static void main(String [] args){
		String str = "?谳?? -2017??\nȫ?浿???? -2015??\n???켱?? -2018??";
		System.out.println("====???? ?? str====\n"+str);
		str = str.replace("-", ":");
		String[] arrStr = str.split("\n");
		str="";
		for(int i=0;i<arrStr.length;i++) {
			String[] reStr = arrStr[i].split(":");
			reStr[1]=reStr[1].replace(reStr[1], "1999??");
			//reStr[1]="1999??";
			str+=(reStr[0]+":"+reStr[1]+"\n");
		}
		System.out.println("====???? ?? str====\n"+str);
	}

}

package day09;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Quiz02 {
public static void main(String[] args)
{
	ArrayList strs = new ArrayList();
	ArrayList strs2 = new ArrayList();

	String str = "Have a nice day Have a nice day Have a nice day";
	
	for(int i = 0 ; i<str.length(); i++)
	{
		
		
		if(str.charAt(i) == 'a')
		{
		   
			strs.add(i);
		}
		
	}
	System.out.print(strs);
	
	
	
	String str2  = "It is a fun java programming";
 	int countA=0, countG=0;
 	for(int i=0; i<str2.length(); i++)
 	{
 		if(str2.charAt(i) == 'a')
 		{
 			countA++;
 		}
 		
 		if(str2.charAt(i) == 'g')
 		{
 			countG++;
 		}		
 		
 	}
 	System.out.println("=================================");
 	System.out.println("총 개수 : " + str2.length());
 	System.out.println("a 개수 : "+countA);
 	System.out.println("g 개수 : "+countG);
 	
 	
 	System.out.println("===================");
 	
 	String str3 = new String("tESt sTRING  change   first ");
 	String changStr = new String();
 	String temp ;

	
	
	
	
}	
}

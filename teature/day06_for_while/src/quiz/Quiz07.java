package quiz;

public class Quiz07 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=1;j<6;j++) {
				System.out.print(j + (5*i) +"\t");
			}
			System.out.println();
		}
		System.out.println("======================================");
	    int su1, su2;	
	    for(su1=1; su1<=5; su1++){	
	    	for(su2=1; su2<=5; su2++)
	    		System.out.print(su1*su2+"\t");
	    	System.out.println();
	    }  

	}
}

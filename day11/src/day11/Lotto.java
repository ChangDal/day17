package day11;

import java.util.ArrayList;
import java.util.HashSet;

public class Lotto {
ArrayList<Integer> suffle(ArrayList<Integer> aList){
	
	
	while(aList.size() < 6) {
		int rand = (int) (Math.random()*(45)+1);
		
		if(!aList.contains(rand))
		{
			aList.add(rand);
		}
		
		
		
	}
	
	
	return aList;
	
}



public HashSet<Integer> suffle1(HashSet<Integer> set) {
	
	while(set.size()<45)
	{
		int rand = (int) (Math.random()*(45)+10);
		set.add(rand);
	}
	return set;
}
}

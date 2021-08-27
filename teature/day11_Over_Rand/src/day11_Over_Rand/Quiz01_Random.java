package day11_Over_Rand;

import java.util.ArrayList;
import java.util.HashSet;

public class Quiz01_Random {
	public ArrayList arrayLotto() {
		ArrayList arr = new ArrayList();
		while(arr.size()<6) {
			int ran = (int)(Math.random() * 6 + 1);
			if(arr.contains(ran) != true)
				arr.add(ran );
		}
		return arr;
	}
	public HashSet setLotto() {
		HashSet set = new HashSet();
		for(; set.size() <6 ;) {
			int ran = (int)(Math.random() * 6 + 1);
			set.add(ran);
		}
		return set;
	}
}






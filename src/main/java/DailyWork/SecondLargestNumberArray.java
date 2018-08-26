package DailyWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestNumberArray {

	public static void main(String[] args) {
		int[] intArray= {8457,94,585,-343,-1212,900,874,89,-633};
		List<Integer> arrayList = new ArrayList<Integer>();
		for (Integer integer : intArray) {
		arrayList.add(integer);		
		}
		System.out.println(arrayList);
	    Collections.sort(arrayList);
	    System.out.println(arrayList);
	    int i=arrayList.size()-2;
	    System.out.println("Second Largest Number is "+arrayList.get(i));      
	}

}

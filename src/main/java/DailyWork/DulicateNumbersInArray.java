package DailyWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class DulicateNumbersInArray {

	public static void main(String[] args) {
		int[] a= {1,323,3,323,3,23,54,23,22,4,22,33,54,34};
		List<Integer> list=new ArrayList<Integer>();
		for (Integer eachvalue : a) {			
			list.add(eachvalue);			
		}		
		Collections.sort(list);
		Set<Integer> newset=new TreeSet<>();
		newset.addAll(list);
		HashMap<Integer, Integer> Map1=new HashMap<Integer,Integer>();
		int duplicateNum = 0;
		for (Integer eachset : newset) {
			duplicateNum=Collections.frequency(list, eachset);
			Map1.put(eachset, duplicateNum);
		}		
		System.out.println("Duplicate values are ");
		for(Entry<Integer, Integer> s:Map1.entrySet()) {	
			if(s.getValue()>1)
			{				
				System.out.println(s.getKey());
			}
		}
	}
}

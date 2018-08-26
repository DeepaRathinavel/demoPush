package DailyWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class CountOfEachCharacter {

	public static void main(String[] args) {
		String string1="amazon india development center";
		List<Character> chars = new ArrayList<>();
		Set<Character> eachset=new HashSet<Character>();
		HashMap<Character, Integer> Map1=new HashMap<Character,Integer>();
		for(char eachchar:string1.toCharArray())
		{
			chars.add(eachchar);
		}               	
		System.out.println(chars);
		Collections.addAll(chars);
		eachset.addAll(chars);
		int maxChar = 0;
		for (Character eachchar : eachset) {
			maxChar=Collections.frequency(chars, eachchar);
			// System.out.println(eachcompany+":"+maxCompany);
			Map1.put(eachchar, maxChar); 			
		}	
		System.out.println(Map1);
	}

}

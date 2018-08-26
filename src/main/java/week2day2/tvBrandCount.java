package week2day2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class tvBrandCount {
	public static void main(String[] args) {
		Map<String, Integer> m= new LinkedHashMap<String, Integer>();
		m.put("Samsung", 5);
		m.put("LG", 4);
		m.put("Sony", 3);
		m.put("BPL", 1);
		m.put("ONIDA", 2);

		// Find the Total number of TV's Brands
		int tvCount=0;
		int value = 0;
		for(Entry<String, Integer> s:m.entrySet()) {
			value = s.getValue();
			tvCount=value+tvCount;
		}
		System.out.println("Total number of TV's : "+ tvCount);

		// Last Model TV Counts
		Set<String> tv=m.keySet();
		List<String> allTV= new ArrayList<String>();
		allTV.addAll(tv);
		
		int lastTvName=allTV.size()-1;
		Integer lastTvCount=m.get(allTV.get(allTV.size()-1));
		
		System.out.println("Last Tv Name: " + allTV.get(lastTvName));
		System.out.println("Last Tv count: " + lastTvCount);
		int n=lastTvCount-1;
		m.put(allTV.get(lastTvName), n);
		for(Entry<String, Integer> s:m.entrySet()) {
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
	}

}

package DailyWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class maximumWorkedCompany {

	public static void main(String[] args) {
		List<String> companys = new ArrayList<>();
		companys.add("tcs");
		companys.add("cts");
		companys.add("amazon");
		companys.add("cts");
		companys.add("wipro");
		companys.add("cts");
		companys.add("tcs");
		companys.add("infosys");
		companys.add("tcs");
		Collections.addAll(companys);     
		Set<String> eachset=new HashSet<String>();
		eachset.addAll(companys);
		HashMap<String, Integer> Map1=new HashMap<String,Integer>();
		int maxCompany = 0;
		for (String eachcompany : eachset) {
			maxCompany=Collections.frequency(companys, eachcompany);
			Map1.put(eachcompany, maxCompany);  	
		}	
		System.out.println(Map1);   
		Integer n=Collections.max(Map1.values());  
		String cName = null;
		System.out.println("Maximum worked in company's");
		for(Entry<String, Integer> s:Map1.entrySet()) {			
			if (s.getValue().equals(n))
			{
				// Store the key from entry to the list				
				cName=s.getKey();	
			    System.out.println(cName);
			}			
		}	
		
	}
}

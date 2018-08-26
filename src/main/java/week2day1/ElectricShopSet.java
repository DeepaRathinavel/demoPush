package week2day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ElectricShopSet {
	public static void main(String[] args)
	{
		Set<String> tvBrands=new TreeSet<String>();
		
		tvBrands.add("ONIDA");
		tvBrands.add("sAMSUNG2");
		tvBrands.add("Solidare12");
		tvBrands.add("Panasonic");
		tvBrands.add("Panasonic");
		tvBrands.add("Apple");
		for(String eachTV:tvBrands)
		{
			System.out.println(eachTV);
		}
		System.out.println(tvBrands.size());	
		List<String> TVs=new ArrayList<String>();
		TVs.addAll(tvBrands);
		int lastItem=TVs.size();
		
		System.out.println("Last Item "+TVs.get(lastItem-1));
		
	}
}

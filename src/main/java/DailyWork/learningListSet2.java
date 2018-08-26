package DailyWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class learningListSet2 {
	public static void main(String[] args)
	{
		String string1="cognizant india";
	
		Set<Character> chars = new TreeSet<>();
        for(char eachchar:string1.toCharArray())
        {
        	chars.add(eachchar);
        }        
	System.out.println(chars);
	
	}
}

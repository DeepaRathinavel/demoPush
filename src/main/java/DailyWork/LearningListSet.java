package DailyWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class LearningListSet {

	public static void main(String[] args)
	{
		String string1="amazon development center";
	
		Set<Character> chars = new TreeSet<>();
        for(char eachchar:string1.toCharArray())
        {
        	chars.add(eachchar);
        }        
	System.out.println(chars);
	List<Character> charList=new ArrayList<Character>();
	charList.addAll(chars);		
	System.out.println(charList);  
	int lastItem=charList.size();
	System.out.println("Last Item "+charList.get(lastItem-1));
	}
}

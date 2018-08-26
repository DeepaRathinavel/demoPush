package week2day1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicShop {
public static void main(String[] args)
{
	List<String> TVs=new ArrayList<String>();
	TVs.add("ONIDA");
	TVs.add("SAMSUNG");
	TVs.add("Solidare");
	TVs.add("Panasonic");
	TVs.add("Panasonic");
	TVs.add("Apple");
	for(String eachTV:TVs)
	{
		//System.out.println(eachTV);
	}
	
	int size = TVs.size();
	//System.out.println(size);
    String lastTV=TVs.remove(size-1);
    //System.out.println("Removed "+lastTV);
    Collections.sort(TVs);   
	for(String eachTV:TVs)
	{
		//System.out.println(eachTV);
	}
	
}
}

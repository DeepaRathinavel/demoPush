package week2day2;

import java.util.Scanner;

public class learningRegex {
	
	public static void main(String[] args) 
		{
		String text="Hi   Hello      World     .";
		
		System.out.println(text.replaceAll("\\s\\ ", ""));
		
		String string1="xabCDxxSScx ";
		//Output: abCDSScxxxx
		string1=string1.replaceAll("x", "");
		System.out.println(string1);
		string1=string1.concat("xxxx");
		System.out.println(string1);
		}


}

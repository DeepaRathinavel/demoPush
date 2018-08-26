package DailyWork;

import java.util.Scanner;

public class arithmaticOperationUsingString {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter string");
		String c=sc.next();
		switch(c)
		{
		case "add":
			System.out.println(a+b);
			break;
		case "substract":
			System.out.println(a-b);
			break;
		case "multifly":
			System.out.println(a*b);
			break;
		case "divide":
			System.out.println(a/b);
			break;
		}

	}
}

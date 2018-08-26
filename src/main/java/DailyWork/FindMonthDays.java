package DailyWork;

import java.util.Scanner;

public class FindMonthDays {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number :");
		int n1=sc.nextInt();
		if(n1<=13)
		{
		n1=n1-1;
		String[] month={"January","February","March","April","May","June","July","August","Septemper","October","November","December"};
		int length=month.length;
		String name=month[n1];
		System.out.println("The "+length+"th month of the year is "+name);		
		switch(name)
		{
		case "January":
			System.out.println("Number of days in the month of "+name+"is "+31);
		case "February":
			System.out.println("Number of days in the month of "+name+"is "+28);
		case "March":
			System.out.println("Number of days in the month of "+name+"is "+31);
		case "April":
			System.out.println("Number of days in the month of "+name+"is "+30);
		case "May":
			System.out.println("Number of days in the month of "+name+"is "+31);
		case "June":
			System.out.println("Number of days in the month of "+name+"is "+30);
		case "July":
			System.out.println("Number of days in the month of "+name+"is "+31);
		case "August":
			System.out.println("Number of days in the month of "+name+"is "+31);
		case "Septemper":
			System.out.println("Number of days in the month of "+name+"is "+30);
		case "October":
			System.out.println("Number of days in the month of "+name+"is "+31);
		case "November":
			System.out.println("Number of days in the month of "+name+"is "+30);
		case "December":
			System.out.println("Number of days in the month of "+name+"is "+31);
		}

	}
		else
			System.out.println("Invalid Number");
}
}

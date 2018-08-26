package DailyWork;

import java.util.Scanner;

public class FindGreatestNumber {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number :");
		int n1=sc.nextInt();
		System.out.print("Enter Second Number :");
		int n2=sc.nextInt();
		System.out.print("Enter Third Number :");
		int n3=sc.nextInt();

		if(n1!=n2 && n2!=n3 &&n3!=n1)
		{
			if(n1>n2 && n1>n3)
				System.out.println(n1+" is the largest number");
			else if(n2>n1 && n2>n3)
				System.out.println(n2+" is the largest number");
			else
				System.out.println(n3+" is the largest number");
		}
	}
}

package DailyWork;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			if(i%3!=0 && i%5!=0)
			System.out.println(i);
			else if(i%3==0 && i%5!=0)
				System.out.println("FIZZ");
			else if(i%3!=0 && i%5==0)
				System.out.println("BUZZ");
			else
				System.out.println("FIZZBUZZ");
		}
	}
}

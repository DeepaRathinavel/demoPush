package week1day2;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first input for multiplication table: ");
		int n=sc.nextInt();
		System.out.print("Enter second number for iteration : ");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++)
		{
			System.out.println(i*n);
		}
	}

}


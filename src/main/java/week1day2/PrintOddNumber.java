package week1day2;

import java.util.Scanner;

public class PrintOddNumber {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		int result,reminder;
		while(a>0)
		{
			result=a%10;
			if(result%2!=0)
			{				
				System.out.println(result);

			}
			reminder=a/10;
			a=reminder;			
		}
	}		
}



package DailyWork;

import java.util.Scanner;

public class reverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int number=sc.nextInt();
		int n=number, reverse=0;
		while(n>0)
		{
		int n1=n%10;
		int n2=n/10;
		 n=n2;
		reverse=n1+(reverse*10);
		
			
		}
		System.out.println(reverse);
	}
	
}

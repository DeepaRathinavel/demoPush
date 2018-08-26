package DailyWork;

import java.util.Scanner;

public class factorial {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
	int c=1,b=1;
		for(b=1;b<=a;b++)
		{
		c=b*c;
		}
		System.out.println("Factorial of "+a+" is "+c);
		}
		
}


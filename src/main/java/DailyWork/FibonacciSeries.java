package DailyWork;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int length=sc.nextInt();
		int i, j=0,k=1;
		for(int n=0;n<length;n++)
		{		
		   i=j+k;
		   j=k;
		   k=i;
		   System.out.println(i);
		}
}
}




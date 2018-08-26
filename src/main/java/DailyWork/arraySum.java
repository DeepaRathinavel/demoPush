package DailyWork;

import java.util.Scanner;

public class arraySum {

	public static void main(String[] args) {
		int numbers[]=new int[5];
		int length=numbers.length;
		int sum=0;
		System.out.print("Enter the numbers :");
		for(int i=0;i<length;i++)
		{
			Scanner sc=new Scanner(System.in);			
			numbers[i]=sc.nextInt();
			sum=sum+numbers[i];
		}	
		System.out.println(sum);
	}

}

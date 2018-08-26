package week1day1;
import java.util.Scanner;
public class MobileServiceProvider {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		if(a==944)
		{
			System.out.println("BSNL");
			
		}
		else if(a==900)
		
			System.out.println("Airtel");
		
		
		else if(a==897)
		
			System.out.println("Idea");
		
		else if(a==630)
			System.out.println("JIO");
		else
			System.out.println("None");
		sc.close();
}
}

package week1day2;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		switch(a)
		{
		case 944:
		System.out.print("BSNL Service provider ");
		break;
		case 900:
		System.out.print("Idea Service provider ");
		break;
		case 897:
		System.out.print("Airtel Service provider ");
		break;
		case 630:
		System.out.print("JIO Service provider ");
		break;
		default:
		System.out.print("Other Service provider ");
		break;
		}
}	
}

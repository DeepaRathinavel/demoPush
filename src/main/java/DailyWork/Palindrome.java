package DailyWork;
import java.util.Scanner;
public class Palindrome {
	/*public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int a=sc.nextInt();
		int result,reminder;
		while (a>0){
        reminder=a%10;         
        System.out.println("reminder"+reminder);
        result=a/10;
        System.out.println("result"+result);
        a=result;
		}
	}*/




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int poliNumber=sc.nextInt();

		int n = poliNumber;
		int reverse = 0;

		while(n>0) {
			int n1 = n%10;

			int n2 = n/10;
			n=n2;
			reverse = n1+(reverse*10);
		}

		// System.out.println(reverse);

		if(poliNumber==reverse) {
			System.out.println(poliNumber + " is Polindrome");
		}else {
			System.out.println(poliNumber + " is not Polindrome");

		}
	}
}

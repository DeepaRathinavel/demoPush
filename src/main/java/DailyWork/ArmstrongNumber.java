package DailyWork;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		int n,number,n1,n2,temp=0,sum=1,total=0;
		for(number=153;number<1000;number++)
		{
			int length=Integer.toString(number).length();
			n=number;
			while(n>0)
			{
				n2=n/10;
				n1=n%10;			
				for(int i=length;i!=0;--i)
				{
					sum=sum*n1;
				}
				temp=sum+temp;			
				sum=1;			
				n=n2;
			}
			total=temp;
			temp=0;
			//System.out.println(temp);
			if(number==total)
				System.out.println("Armstrong numbers are "+total);
		}
	}
}


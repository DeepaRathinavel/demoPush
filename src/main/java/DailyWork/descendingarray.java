package DailyWork;
import java.util.Scanner;
public class descendingarray {
	public static void main(String args[])
	{

		int numbers[]=new int[5];
		int length=numbers.length;
		System.out.print("Enter the numbers :");
		for(int i=0;i<length;i++)
		{
			Scanner sc=new Scanner(System.in);			
			numbers[i]=sc.nextInt();			
		}		
		int i,j,k;
		System.out.println("Descending Order:");
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(numbers[i]<numbers[j])
				{
					k=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=k;
				}
			}				
			System.out.println(numbers[i]);
		}
		System.out.println("Ascending Order:");
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(numbers[i]>numbers[j])
				{
					k=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=k;
				}
			}				
			System.out.println(numbers[i]);
		}
		//System.out.println("The First largest number is "+numbers[0]);
		//System.out.println("The Third largest number is "+numbers[2]);
	}

}

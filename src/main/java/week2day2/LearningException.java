package week2day2;

public class LearningException {

	
	public static void main(String arugs[])
	{
		int[] Numbers= {1,2,3,4,5};	
		try
		{
		int l=Numbers.length;		
		System.out.println(Numbers[l+1]);
		}
		catch(Exception e) {
			System.out.println("Invalid index :"+e.getMessage());
		}
		}
	}


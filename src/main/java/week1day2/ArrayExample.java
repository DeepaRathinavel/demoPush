package week1day2;
import week1day1.MobilePhone;
import week1day1.MobileBalance;
public class ArrayExample {
	static String message="Good morning! Happy Sunday!";


	public static void main(String arugs[])
	{
		MobilePhone MobilePhone2=new MobilePhone();
		MobileBalance Mb1=new MobileBalance();

		/*long[] Numbers= {9000812341l,9000812342l,9000812343l,9000812344l,9000812345l};
		for(long eachNumber:Numbers)
		{
			MobilePhone2.SendSMS(eachNumber, message);
		}*/

		while(Mb1.Mobilebalance>0)
		{

			MobilePhone2.SendSMS(93843943743l, "Hello");
			Mb1.SMScost();
			MobilePhone2.call(987654321l);
			Mb1.Callcost();
			System.out.println("Mobilebalance"+Mb1.Mobilebalance);
		}
	}
}

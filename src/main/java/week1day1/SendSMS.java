package week1day1;

public class SendSMS {
	static String message="Good morning! Happy Sunday!";
	public static void main(String args[])
	{
		MobilePhone MobilePhone1=new MobilePhone();
		MobilePhone1.SendSMS(9000812341l, message);
		MobilePhone1.SendSMS(9000812342l, message);
		MobilePhone1.SendSMS(9000812343l, message);
		MobilePhone1.SendSMS(9000812344l, message);
		MobilePhone1.SendSMS(9000812345l, message);
		MobilePhone1.SendSMS(9000812346l, message);
	}
	
}

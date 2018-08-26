package week1day1;

public class MobilePhone {

	static long IME;
	static String model;
	static int price;
	static float version;
	static boolean IsPhoneLocked;
	static long SimNumber;
	static String Name;
	static boolean IscontactActive;
	static void phoneDetails()
	{
		IME=1223423423;
		model="Lenovo VIBE";
		price=19999;
		version=16.0f;
		IsPhoneLocked=false;
		SimNumber=9841616215l;

	}
	static boolean PhoneLock(long IME)
	{
		IsPhoneLocked=false;
		System.out.println("IME "+IME+" locked succesfully");
		return IsPhoneLocked;

	}

	public static void AddContact(String CName,long CSimNumber ) {
	IscontactActive=true;
	Name=CName;
	SimNumber=CSimNumber;
		System.out.println("Contact "+Name+" Added Successfully");

	}
	
	static long SearchContact(String Name) {
		System.out.println("Searching Contact Number of "+Name);
		return 9842140621l;
	}
	
	private static String EditContact(String Name,long SimNumber)
	{
		Name=Name;
		SimNumber=SimNumber;
		//System.out.println("Name updated successfully");
		System.out.println("Contact updated successfully");
		return Name;
	}
	
	static void DeleteContact(String Name) {
		System.out.println("Contact deleted successfully");
	}

	public void SendSMS(long SNumber, String SMS)
	{
		System.out.println("SNumber : "+SNumber+" Message :"+SMS);
		System.out.println("SMS Sent successfully");	
	}

	public static void call(long SimNumber)
	{
		System.out.println(SimNumber+" Called Successfully");
	}

	public void main(String args[])
	{
		phoneDetails();
		boolean lock=PhoneLock(1223423423);
		System.out.println(lock);
		AddContact("Deepa",9841616215l);
		long MobileNumber=SearchContact("Deepa");
		System.out.println(MobileNumber);
		String Name=EditContact("Deepa",9841616215l);
		DeleteContact("DeepaR");
		System.out.println(Name);
		SendSMS(9841616215l,"Good Morning");
		call(1223423423);

	}
}

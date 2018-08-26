package week1day1;

public class LearningObjects {
	public static void main(String args[])
	{
		MobilePhone Mb=new MobilePhone();
		Mb.AddContact("Pranav", 9710422834l);
		System.out.println("Is contact Active"+Mb.IscontactActive);
		//Mb.EditContact("PranavS", 9710422834l);
		Mb.DeleteContact("PranavS");
	}
}

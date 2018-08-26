package week1day1;

public class MobileBalance {
	public int Mobilebalance=9, CallCost=2,SMSCost=1,i;
	public void SMScost() {
		Mobilebalance=Mobilebalance-SMSCost;
			}
	
	public void Callcost() {
		
		Mobilebalance=Mobilebalance-CallCost;
	}
public  void main(String args[])
{

MobilePhone MB1=new MobilePhone();
for(i=Mobilebalance;i>=1;i--)  
{
	MB1.SendSMS(93843943743l, "Hello");
	SMScost();
	System.out.println("Mobilebalance"+Mobilebalance);
	}
//if(Mobilebalance<=9)
//{
//	MB1.SendSMS(93843943743l, "Hello");
//	SMScost();
//	MB1.call(93743437483l);
//	Callcost();
//	MB1.SendSMS(93843943743l, "Hello");
//	SMScost();
//	MB1.call(93743437483l);
//	Callcost();
//	MB1.SendSMS(93843943743l, "Hello");
//	SMScost();
//	MB1.call(93743437483l);
//	Callcost();
//	MB1.SendSMS(9384394454l, "NOT");
//	SMScost();
//	MB1.call(93743437483l);
//	Callcost();
//	System.out.println("Balance :"+Mobilebalance);
//}
//else
//System.out.println("Your mobile balance is 0");
}
}
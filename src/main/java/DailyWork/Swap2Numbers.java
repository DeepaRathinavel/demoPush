package DailyWork;

public class Swap2Numbers {

	public static void main(String[] args) {
    int a=2,b=3;
    System.out.println("Before swap A: "+a);
    System.out.println("Before swap B: "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swap A: "+a);
    System.out.println("After swap B: "+b);
	}

}

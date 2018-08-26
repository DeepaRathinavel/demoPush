package week1day2;

public class LearningString {
	public static void main(String[] args) {
		String myName=new String("Deepa Rathinavel");
		boolean Name=myName.contains("p");
		System.out.println("Name Contains"+Name);
		String Name1=myName.replace("Rathinavel", "Subramani");
		System.out.println("New Name"+Name1);
		int i=Name1.indexOf("S");
		System.out.println("Index"+i);
	}
}
		
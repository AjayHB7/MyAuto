package exception_Handalin;

public class Pfour {

	public static void main(String[] args)
	{
		System.out.println("program starts");
		Pfour s=null;
		try
		{
			System.out.println(s.hashCode());
		} catch (NullPointerException e) {
			System.out.println("exception is handled");
		}
		System.out.println("program ends");
	}

}

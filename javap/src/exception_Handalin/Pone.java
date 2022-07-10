package exception_Handalin;

public class Pone {

	public static void main(String[] args) 
	{
		try 
		{
			int i=1/0;
			
		} catch (ArithmeticException e)
		{
			System.out.println("exception is handled");
		}
	}

}

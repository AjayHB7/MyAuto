package exception_Handalin;

public class Ptwo 
{

	public static void main(String[] args) 
	{
		System.out.println("nine modaluu");

		try 
		{
			int i=1/0;

		} catch (ArithmeticException e) 
		{
			System.out.println("exception is handled");
		}
		
		System.out.println("nine kone");
	}

}

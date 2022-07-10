package exception_Handalin;

public class Pthree
{

	public static void main(String[] args) 
	{
		System.out.println("start");
		int[]array={10,20,30};
		
		
		try
		{
			System.out.println(array[2]);
			
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("exception is handled");
		}
		System.out.println("end");
	}

}

package exception_Handalin;

public class Psix {

	public static void main(String[] args)
	{
		System.out.println("program starts");
		int[]array={10,20,30,40,50};
		try {
			int i=1/0;	
		} 
		//System.out.println("nandelidle");
		catch (Exception e) {
			System.out.println("exception is handled");
		}
		System.out.println("program ends");
	}

}

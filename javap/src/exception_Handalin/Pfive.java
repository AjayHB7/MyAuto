package exception_Handalin;

public class Pfive 
{
	public static void main(String[] args)
	{
		System.out.println("program starts");
		int[]ary={1,3,2,4,5,6,7,8,9};
		try {
			int i=1/0;
			System.out.println(ary[9]);
		} catch (ArithmeticException e) {
			System.out.println("arithmetic exection is handled");
		}catch (NullPointerException e) {
			System.out.println("nullpointer exeception is handled");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array out of boundary exception is handled");
		}
		System.out.println("program ends");
	}

}

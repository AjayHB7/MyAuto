package constactor_overloading;

public class Throws 
{
	static int[]array={1,2,3,4,5,6,7,8,9};
	static int z=1;
	static void one() 
	{
		
		System.out.println("hello");
		int i=z/0;
		System.out.println("hi");
		System.out.println(array[10]);
		System.out.println("bye");
	}

	public static void main(String[] args)  
	{
		one();
	}

}

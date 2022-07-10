package exception_Handalin;

public class Pseven {

	public static void main(String[] args) 
	{
			System.out.println("program starts");
			int[]array={10,20,30,40,50};
			try{
				System.out.println(array[6]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array out of bound ");
			}
			finally {
				System.out.println("finally");
			}
			System.out.println("program ends");
		}
		
	

}

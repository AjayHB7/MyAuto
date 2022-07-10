package demo;

public class callsingleton {

	public static void main(String[] args)
	{
		singleton o = singleton.get();
		singleton d = singleton.get();
		
		System.out.println(o.hashCode());
		System.out.println(d.hashCode());
		
	}

}

package oops_2;

public class laptap_details
{
	public static void main(String[] args) 
	{
		laptop_sony sony= new laptop_sony();
		laptop_hp hp = new laptop_hp();
		laptop_dell dell= new laptop_dell();
		laptop_asus asus = new laptop_asus();
	
		System.out.println("-------------------------------------------------------------------------------------------");
		website.show_details(sony);
		System.out.println("-------------------------------------------------------------------------------------------");
		website.show_details(hp);
		System.out.println("-------------------------------------------------------------------------------------------");
		website.show_details(dell);
		System.out.println("-------------------------------------------------------------------------------------------");
		website.show_details(sony);
		System.out.println("-------------------------------------------------------------------------------------------");

		
		
	}
	

}

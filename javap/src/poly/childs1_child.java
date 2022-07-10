package poly;

public class childs1_child extends child_one
{
	 
		void sample4()
		{
			System.out.println("this is sample 4 in childs1_child");
		}
		void sample5()
		{
			System.out.println("this is sample 5 in childs1_child");
		}
		void sample2()
		{
			System.out.println("this is sample 2  in childs1_child");
		}
		
		
	    
		public static void main(String[]args) 
	    {
	    childs1_child c1c=new childs1_child();
	   // c1c.sample1();
	    //c1c.sample2();
	    //c1c.sample3();
	    runner.run(c1c);
	    System.out.println("--------------------------------------------------------------------------------------");
	    runner.run1(c1c);
	  //  childs1_child y = c1c;
	   // y.sample2();
	    
	 //   c1c.sample4();
	  //  c1c.sample5();
	    }	

}

package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map {
	public static void main(String[] args) 
	{
		// creating a hashmap object 
		HashMap<String, String> hm = new HashMap<String, String>();
		
		// adding key and value pair to the hashmap
		hm.put("karnataka", "bangalore");
		hm.put("tamilnadu", "chennai");
		hm.put("maharastra", "mumbai");
		hm.put("andrapradesh", "hydrabad");
		
		// printing entire hashmap 
		System.out.println(hm);
		// hashmap does not follow order of insertion
		// {maharastra=mumbai, karnataka=bangalore, andrapradesh=hydrabad, tamilnadu=chennai} 
		
		// to get size of the hashmap
		System.out.println(hm.size()); // it will return size in int				
		
		// printing value in the hashmap by passing key using get() method
		System.out.println(hm.get("karnataka")); // bangalore
		
		/*
		//removing a item from the hashmap
		// by passing only key, returns value of removed item
		System.out.println(hm.remove("maharastra")); // mumbai
		
		//by passing both key and value, returns boolean
		System.out.println(hm.remove("andrapradesh","hydrabad")); // true
		
		// To remove all items, using clear() method
		hm.clear();
		System.out.println(hm); // all the items from the hashmap is removed
		*/
		
		// only to get keys
		Set<String> keys = hm.keySet();
		System.out.println(keys); // [maharastra, karnataka, andrapradesh, tamilnadu]
		
		// only to get values
		Collection<String> values = hm.values();
		System.out.println(values); // [mumbai, bangalore, hydrabad, chennai]
		
		for (String k : hm.keySet()) 
		{
			System.out.println("key------>"+k); // prints only keys
			
			System.out.println("keys "+k+" its value is "+hm.get(k)); // prints both key and its value
			System.out.println();
		}
		
		
		for (String v : hm.values()) {
			System.out.println("value\'s------>"+v); // prints only values 
		}
		
		// to override the value of an item
		hm.put("karnataka", "shimoga");
		
		System.out.println(hm);	//{maharastra=mumbai, karnataka=shimoga, andrapradesh=hydrabad, tamilnadu=chennai}	
	}
	

}

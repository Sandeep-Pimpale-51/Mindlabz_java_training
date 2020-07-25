import java.util.*;
class Q3
{
	public static void main(String[] args)
	{
		System.out.println("............Methods in Hashmap............");
		System.out.println("Create hashmap and put elements to the map");
		
		// Create a hashmap
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		
		//Put elements to the map
		m1.put(1,"Sandip");
		m1.put(4,"Vishal");
		m1.put(5,"Suyash");
		m1.put(3,"Ashruba");
		m1.put(2,"Jay");
		System.out.println("Hastmap:"+m1);
		System.out.println();
		
		//Get set of entries
		Set set=m1.entrySet();
		
		//Get an iterator
		System.out.println("Using iterator:");
		Iterator i=set.iterator();
		
		//Display
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		    System.out.println("After  put() method ");  
     		for(Map.Entry m:m1.entrySet())
	  	{    
       			System.out.println(m.getKey()+" "+m.getValue());    
      		}  
        
    		  m1.putIfAbsent(6, "Gaurav");  
	 	 System.out.println();
		
      System.out.println("After  putIfAbsent() method ");  
	  
     	 for(Map.Entry m:m1.entrySet())
	 {    
         	  System.out.println(m.getKey()+" "+m.getValue());    
          }  
      HashMap<Integer,String> map=new HashMap<Integer,String>();  
      map.put(7,"Tahir");  
      map.putAll(m1);  
	  System.out.println();
		
      System.out.println("After putAll() method ");  
	  
      for(Map.Entry m:map.entrySet())
	  {    
           System.out.println(m.getKey()+" "+m.getValue());   
	}
	System.out.println();
	
	 //.........................................................................................................................
 	System.out.println("Make a copy of hashmap");
 	// Creating copy
 	HashMap<Integer,String>clonem1=(HashMap<Integer,String>)m1.clone();
	 System.out.println("cloned hashmap:"+clonem1);
 	System.out.println();

	 //.......................................................................................................................
	 System.out.println("isEmpty():");
  	  // checks whether hashmap has elements
	 boolean b=m1.isEmpty();
 	System.out.println("Is Hashmap empty?----->"+b);
 	System.out.println();
   	//....................................................................................................................
   
       // Get the value
	   System.out.println("Hashmap1:"+m1);
   	System.out.println("get()::");
   	String value=m1.get(3);
   	System.out.println("value of key 3 :"+value);
   	//getOrDefault
   	String value1=m1.getOrDefault(5,"Not Found");
   	System.out.println("getOrDefault() fir key 5:"+value1);
   
   	String value2=m1.getOrDefault(9,"Not Found");
   	System.out.println("getOrDefault() fir key 9:"+value2);
   	System.out.println();
  	 //..............................................................................................................
  	 System.out.println("keySet()::");
  	 System.out.println("Hashmap1:"+m1);
    	  // Returns set of all keys
	  System.out.println("Keys:"+m1.keySet());
	  //Returns set of all elements
	  System.out.println("Values:"+m1.values());
	  System.out.println();
	//.........................................................................................................................
	System.out.println("merge():");
	System.out.println("Hashmap1:"+m1);

    String returnedValue = m1.merge(8,"Niraj", (oldValue, newValue) -> oldValue + newValue);
    System.out.println("Merge :" + returnedValue);
    System.out.println("Updated HashMap: " + m1);
	System.out.println();
	 //........................................................................................................................
 
	 System.out.println("replace()::");
     System.out.println("Replaced 2:");  
     m1.replace(2, "Gaurav");  
     for(Map.Entry m:m1.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
	 System.out.println();
     System.out.println("Replace Ravi with Vijay:");  
     m1.replace(1, "Ravi", "Vijay");  
     for(Map.Entry m:m1.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }   
	 System.out.println();
     System.out.println("Replaceall with Ajay:");  
     m1.replaceAll((k,v) -> "Ajay");  
     for(Map.Entry m:m1.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
	 System.out.println();
 	//........................................................................................................................
 	 HashMap<Integer,String> m4=new HashMap<Integer,String>();          
      m4.put(100,"One");    
      m4.put(101,"Two");    
      m4.put(102,"Three");  
      m4.put(103, "Four");  
    System.out.println("Initial list of elements: "+m4);  
        m4.remove(100);  
    System.out.println("Updated list of elements: "+m4);  
    //key-value pair based removal  
    m4.remove(102, "Three");  
    System.out.println("Updated list of elements: "+m4);  	

  }
}
import java.util.*;

class Q2
{
	public static void main(String[] args)
   {
	System.out.println("...................Methods in Hashset....................");
	//Creating HashSet and adding elements
	System.out.println("Creating hashset and adding elements in hashset:");
	HashSet<String> h1=new HashSet<String>();
	h1.add("Sandip");
	h1.add("Ajay");
	h1.add("Vishal");
	h1.add("Ashruba");
	h1.add("Jay");
	 
	 //Display
	 System.out.println("HashSet1:"+h1);
	 
	 //Display using iterator
	 System.out.println("Using iterator:");
	 Iterator<String> i=h1.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	 System.out.println();
	//....................................................................................
    	System.out.println("Clone():");
	System.out.println("Hashset1:"+h1);
	     HashSet <String> h2=new HashSet<String>();
    		h2=(HashSet)h1.clone();
	 System.out.println("Hashset2:"+h2);
	 System.out.println();
	//....................................................................................
	System.out.println("isEmpty() method:");
	    boolean empty=h1.isEmpty();	
  		if(empty==true)
		{     
        		System.out.println("Hashset is empty"); 

		}
		else
		{
			System.out.println("Hashset is not empty"); 
		}
	 System.out.println();
	//......................................................................................

	//Adding duplicate elements
	System.out.println("Hashset contains specific element:");
	h1.add("Vishal");
	h1.add("Ashruba");
	System.out.println(h1);

	//check if hashset contains specific element
 	 String s="Jay";
  	if(h1.contains(s))
	  {
 		 System.out.println(s+" is in the hashset");
 	 }
	  else
  	{
		  System.out.println(s+" is not in the hashset"); 
 	 }
  	System.out.println();
	
	//.....................................................................................
	  System.out.println("Sorting hashset:");
 	 List<String> list=new ArrayList<String>(h1);
	Collections.sort(list);
 	System.out.println("Sorted order:"+h1);
 	System.out.println();
	
	 //....................................................................................
	 System.out.println("Hashset1:"+h1);
       //Display size 
     	 System.out.println("size():"+h1.size());
	System.out.println();
	
	//.....................................................................................
	System.out.println("Object[] toArray()");
   	  System.out.println("Hashset1:"+h1);
	 //Create an array
  	      Object[] array=h1.toArray();
	//Display array		
	System.out.println("Array:");
	   for(int j=0;j<h1.size();j++)
	   {
		   System.out.println(array[j]);
	   }
	   	System.out.println();
	//........................................................................................		
	 //Creating another object
  	System.out.println("Sorting hashset:");
   	HashSet<String> h3=new HashSet<String>();
  	 h3.add("One");
  	 h3.add("Two");
  	 h3.add("Three");
  
	//Remove all new elements
	System.out.println("remove():");
   	h1.removeAll(h3);
  	 System.out.println("removeAll():"+h1);
   
	   //Removing elements from h1 which are in h2
	h1.retainAll(h3);
	System.out.println("Hashset after"+ "retainAll():"+h3);
	
	//Removing all elements
	h1.clear();
	System.out.println("clear():"+h1);
	  System.out.println();
 	//....................................................................................
	  
   
   

    }
}
//---------------Methods in ArrayList------------------ 

import java.util.*; 
  
public class Q19 { 
    public static void main(String args[]) 
    { 
  
	//---------------Methods in ArrayList------------------
	System.out.println("---------------Methods in ArrayList------------------");

      
	   System.out.println("\n1.Methods to costruct ArrayList"); 

	// create a ArrayList1 
        ArrayList<String> str1 = new ArrayList<String>(); 
  
        // Initialize an ArrayList with add() 
        str1.add("one"); 
        str1.add("two"); 
        str1.add("Three"); 
  
        // print ArrayList 
        System.out.println("ArrayList1 : " + str1); 

	//------------------------------------------------------------------------------------
	
         System.out.println("\n2.Use of ensureCapacity() :"); 

	str1.ensureCapacity(7);
	 str1.add("Four"); 
        str1.add("Five"); 
        str1.add("Six"); 
	
	   System.out.println("ArrayList1 : " + str1); 
	//------------------------------------------------------------------------------------
	
         System.out.println("\n3.Use of trimToSize() :");
	
	 str1.trimToSize();

        // print ArrayList 
        System.out.println("ArrayList1 : " + str1+" With Size "+str1.size()); 

 	//------------------------------------------------------------------------------------
	
         System.out.println("\n4.Use of Size() :");
	
	   System.out.println("ArrayList1 : " + str1+" With Size "+str1.size()); 


	 //------------------------------------------------------------------------------------
	
         System.out.println("\n5.Use of isEmpty() :");
	
	
	boolean empty=str1.isEmpty();	
       
  	if(empty==true)
	{     
        	System.out.println("\nArrayList1 is Empty"); 

	}
	else
	{
		System.out.println("\nArrayList1 is not Empty"); 
	}

	 //------------------------------------------------------------------------------------
	
         System.out.println("\n6.Use of contains() :");
	boolean has=str1.contains("Six");
	if(has==true)
	{     
        	System.out.println("\nElement is Present"); 

	}
	else
	{
		System.out.println("\nElement is Not Present"); 
	}

	 //------------------------------------------------------------------------------------
	
         System.out.println("\n7.Use of indexOf() & lastIndexOf():");
	 ArrayList<String> str2 = new ArrayList<String>(); 
	
	str2.add("Sandy");
	str2.add("Mandy");
	str2.add("Sandy");
	str2.add("Sandip");
	str2.add("Sandesh");
	
	int i1=str2.indexOf("Sandy");
	
	System.out.println("\nFirst Occurance of Element Sandy is at :"+i1); 

	
	int i2=str2.lastIndexOf("Sandy");
	
	System.out.println("\nLast Occurance of Element Sandy is at :"+i2); 
	
	 //------------------------------------------------------------------------------------
	
         System.out.println("\n8.Use of toArray():");
	
	Object[] arr=str2.toArray();
	
	for (Object value : arr) {
         System.out.println("Number = " + value);
      }
	
	//------------------------------------------------------------------------------------
	
         System.out.println("\n9.Use of get():");
	
	 ArrayList<Integer> num1 = new ArrayList<Integer>(); 
	
	num1.add(10);
	num1.add(20);
	num1.add(30);
	num1.add(40);
	num1.add(50);
	
	
	int value=num1.get(3);
	System.out.println("Retrieved element is :" + value);
	
	//------------------------------------------------------------------------------------
	
         System.out.println("\n10.Use of set():");
	
	System.out.println("\nBefore replacing elements Are :" + num1);

	int value1=num1.set(3,45);
	System.out.println("\nAfter replacing elements Are :" + num1);

	//------------------------------------------------------------------------------------
	
         System.out.println("\n11.Use of add():");
	 
	System.out.println("\nBefore appending elements Are :" + num1);

	num1.add(60);
	System.out.println("\nAfter appending elements Are :" + num1);

	//------------------------------------------------------------------------------------
	
         System.out.println("\n12.Use of add(index,value):");
	
	System.out.println("\nBefore appending elements Are :" + num1);

	num1.add(3,60);
	System.out.println("\nAfter appending at 3rd index elements Are :" + num1);

	//------------------------------------------------------------------------------------
	
         System.out.println("\n13.Use of remove():");
	System.out.println("\nBefore removing elements Are :" + num1);

	num1.remove(3);
	System.out.println("\nAfter removing elements Are :" + num1);

	//------------------------------------------------------------------------------------
	
         System.out.println("\n14.Use of remove():");
	System.out.println("\nBefore removing elements Are :" + num1);

	num1.remove(3);
	System.out.println("\nAfter removing elements Are :" + num1);
     
	//------------------------------------------------------------------------------------
	
         System.out.println("\n14.Use of remove(value):");

	System.out.println("\nBefore removing elements Are :" + str1);

	str2.remove("Sandy");
	System.out.println("\nAfter removing elements Are :" + str1);
	
	//------------------------------------------------------------------------------------
	
         System.out.println("\n15.Use of clear() :");

	System.out.println("\nBefore removing elements Are :" + str1);

	str1.clear();
	System.out.println("\nAfter removing elements Are :" + str1);

	//------------------------------------------------------------------------------------
	
         System.out.println("\n16.Use of subList() :");

	System.out.println("\nOriginal ArrayList :" + str1);

	List<String> str7=str2.subList(2,4);
	System.out.println("\nSubList :" + str7);

	//------------------------------------------------------------------------------------
	
         System.out.println("\n17.Use of addAll() for adding two AL :");

	ArrayList<String> str3= new ArrayList<String>(); 
	
	str3.add("Sandy");
	str3.add("Sandip");
	str3.add("Sandy");
	
	
	System.out.println("\n ArrayList1 :" + str3);

	ArrayList<String> str4= new ArrayList<String>(); 
	
	str4.add("Sandesh");
	str4.add("sagar");
	
	System.out.println("\n ArrayList2 :" + str4);
	
	str3.addAll(str4);
	
	System.out.println("\n Elements after appending ArrayList 2 AT End of ArrayList1 :" + str3);

	//------------------------------------------------------------------------------------
	
         System.out.println("\n18.Use of addAll(index,collection) :");
	
	ArrayList<String> str5= new ArrayList<String>(); 
	
	str5.add("Sanket");
	str5.add("sangram");
	
	System.out.println("\n ArrayList2 :" + str5);
	
	str3.addAll(1,str5);
	
	System.out.println("\n Elements after inserting  ArrayList 2 AT 2nd index of ArrayList1 :" + str3);
     
     
    } 
} 
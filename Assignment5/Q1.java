import java.util.*;
 class Q1
{
	public static void main(String[] args)
	{
		System.out.println("..........Methods in LinkedList.................");
        	System.out.println("void add(int index,Object element)::");
		
			//Create a LinkedList
			LinkedList<String> l1=new LinkedList<String>();
		
			//Initialize LinkedList with add()
			l1.add("Sandy");
			l1.add("Sandip");
			l1.add("Sanjog");
		
		//Display using iterator
		Iterator<String> itr=l1.iterator();
		System.out.println("LinkedList1 using iterator:");
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		 //Adding element to specific position
		 System.out.println("Before adding to a specific position:"+l1);
	   		l1.add(1,"Sagar");
	   	
		System.out.println("After adding to a specific position :"+l1);
		System.out.println();
	//...........................................................................
      		System.out.println("boolean add(Object 0)::");
	  		//using add method
	  		l1.add("Nikhil");
	  		l1.add("Nitin");
	  		l1.add("Nishant");
	  	
		System.out.println("add() method:"+l1);
	  
	  	//Use addFirst() to add element to the beginning
	   	
		System.out.println("Before adding element to the beginning:"+l1);
			l1.addFirst("Pradip");
		System.out.println("addFirst():"+l1);

		//Use addLast() to add element to the end
		l1.addLast("Vijay");
		System.out.println("addLast():"+l1);
	    System.out.println();
	//..........................................................................
      		System.out.println(".boolean addAll(Collection c)::");
       			Collection<String> collect=new ArrayList<String>();
        		collect.add("One");
			collect.add("Two");
			collect.add("Three");
		
			//Using addAll() method
			l1.addAll(collect);
			System.out.println("addAll():"+l1);
	    		System.out.println();
	//................................................................................
      		//Using set() method
	   	System.out.println("Before changing element:"+l1);
       			l1.set(1,"Yash");
	   	System.out.println("set() method:"+l1);
        	System.out.println();
	//..........................................................................
  
  		System.out.println("Using remove(object) and remove(int index)::");		
	  	 // removeFirst() to remove first element
	   	 System.out.println("Before removing first element:"+l1);
	    	l1.removeFirst(); 
	   	 System.out.println("removeFirst():"+l1);

		// removeLast()  to remove last element
		l1.removeLast();
		System.out.println("removeLast():"+l1);
		
	 //Remove specific Index element
		 System.out.println("Before removing specific index element:"+l1);
	    		 l1.remove(1);
		 System.out.println("Index removal:"+l1);
		 
		 //Remove specific object
		 l1.remove("Two");
		 System.out.println("Object removal:"+l1);
		 System.out.println();
	//...............................................................................
		  //Adding new Linkedlist
		  LinkedList<String> l2=new LinkedList<String>();
		 l2.add("four");
		 l2.add("five");
		 l2.add("six");
		 
		 //Adding new elements
		 System.out.println("Before new elements:"+l1);
		 l1.addAll(l2);
		 System.out.println("Updated list:"+l1);
		 
		  //Remove all the new elements
		 l1.removeAll(l2);
		 System.out.println("RemoveAll():"+l1);
		 
		 //Remove first occurrence of element
		 l1.removeFirstOccurrence("Pink");
		 System.out.println("removeFirstOccurrence():"+l1);
		 
		 //Remove Last occurrence of element
		 l1.removeLastOccurrence("Red");
		 System.out.println("removeLastOccurrence():"+l1);
		 System.out.println();
	//.....................................................................................
		 
		 //Remove all elements available
		 System.out.println("Before clearing list:"+l1);
		 l1.clear();
		 System.out.println("clear():"+l1);
		 System.out.println();
	//.....................................................................................
   		System.out.println("Object clone()::");       
		  l1.add("Ram");
		  l1.add("Ravi");
		  l1.add("Raju");
		  l1.add("Raghav");
		  l1.add("Ram");
		  l1.add("Raghav");
		  System.out.println("Linkedlist1:"+l1);
		  LinkedList l3=new LinkedList();
		  //clone l1
		  l3=(LinkedList)l1.clone();
		  System.out.println("LinkedList2:"+l3);
		  System.out.println();
	//......................................................................................
 		 System.out.println("Boolean contains(Object o)");  
       		System.out.println("LinkedList1:"+l1);
	   	//check whether the list contains Ravi
	  	 System.out.println("List contains 'Ravi':"+l1.contains("Ravi"));
      		 System.out.println("List contains 'Ajit':"+l1.contains("Ajit"));
		  System.out.println();
	//......................................................................................

	System.out.println("Object get(int index)");
		System.out.println("LinkedList1:"+l1);
         //Display element at index 1
		 System.out.println("Element at index 1:"+l1.get(1));
		   
	    //getFirst() to display first element 
        System.out.println("getFirst():"+l1.getFirst());	

        //getLast() to display last element
       System.out.println("getLast():"+l1.getLast());
		System.out.println();
	//......................................................................................		
		System.out.println("int indexOf(Object o)");
   		System.out.println("LinkedList1:"+l1);
  	   //get index of element
  	     System.out.println("Index of Raju:"+l1.indexOf("Raju"));
	   //If elementis not present in list it returns -1
	   System.out.println("Index of Amit:"+l1.indexOf("Amit"));
	   
	   //int lastIndexOf(Object o)
	   System.out.println("lastIndexOf(Ram):"+l1.lastIndexOf("Ram"));
	//.....................................................................................
     		  System.out.println("LinkedList1:"+l1);
      	 //Display size of LinkedList
    		  System.out.println("size():"+l1.size());
		  System.out.println();
	//........................................................................................
	System.out.println("Object[] toArray()");
   	  System.out.println("LinkedList1:"+l1);
		 //Create an array
        	Object[] array=l1.toArray();
		//Display array		
	System.out.println("Array:");
	   for(int i=0;i<l1.size();i++)
	   {
		   System.out.println(array[i]);
	   }
	//......................................................................................
	System.out.println("DescendingIterator():");
	  Iterator i=l1.descendingIterator();
	  while(i.hasNext())
 	 {
		  System.out.println(i.next());
 	 }
  		System.out.println();
	 //...................................................................................
 
	 System.out.println("Offering a new element");
    		System.out.println("LinkedList1:"+l1);
		//adds elementat tail
		l1.offer("Ashi");
		System.out.println("offer():"+l1);
	
		//adds element at head
		l1.offerFirst("Tina");
		System.out.println("offerFirst():"+l1);
	
		//adds element at the end
		l1.offerLast("Sooraj");
		System.out.println("offerLast():"+l1);
		System.out.println();
	//...................................................................................
		System.out.println("peek() in a linkedlist:");
  		System.out.println("LinkedList1:"+l1);
  		//prints 1st element 
      		System.out.println("peek():"+l1.peek());
		  System.out.println("peekFirst():"+l1.peekFirst());
	 	 //prints last element
	 	 System.out.println("peekLast():"+l1.peekLast());
	  	System.out.println();
	//...................................................................................
	System.out.println("poll() in a linkedlist");
	 System.out.println("LinkedList1:"+l1);
 	  //Retrieve and remove head
  	 System.out.println("poll():"+l1.poll());
  	 //print resultanat list
    	System.out.println("Linkedlist after removal using poll():"+l1);
	//pollFirst()
	 System.out.println("pollFirst():"+l1.pollFirst());
	 System.out.println("Linkedlist after removal using pollFirst():"+l1);
	 //pollLast()
	  System.out.println("pollLast():"+l1.pollLast());
	 System.out.println("Linkedlist after removal using pollLast():"+l1);
 	System.out.println();
 	//......................................................................................
	 System.out.println("push() and pop():");
	  System.out.println("LinkedList1:"+l1);
		  //push element
 		 l1.push("Rohan");
 	 System.out.println("push():"+l1);
  
	  //pop element
	  System.out.println("pop():"+l1.pop());
 	 System.out.println("Updated linkedlist:"+l1);
 
  }
}
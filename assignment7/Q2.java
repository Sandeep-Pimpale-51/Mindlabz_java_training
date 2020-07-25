import java.util.*;
class Count
 {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) 
	{

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
 }
	
	interface UnaryPredicate<T> 
	 {
   		 public boolean test(T obj);
	}

	class EvenPredicate implements UnaryPredicate<Integer>
 	{
  		  public boolean test(Integer i)
		{
			return i % 2 == 0;
		}
	}
	class OddPredicate implements UnaryPredicate<Integer>
	 {
  		  public boolean test(Integer i) 
		{ 
			return i % 2 != 0;
		}
	}


	 class Q2
	{
 	   public static void main(String[] args)
	{
      
       		 Collection<Integer> c1 = Arrays.asList(2 ,4 ,6 ,7, 8,9,90,78,41,56,79,45,65,85);
       		 int count1 = Count.countIf(c1, new OddPredicate());
       		 int count2 = Count.countIf(c1, new EvenPredicate());
		System.out.println("No. of odd integers = " + count1);
 		  System.out.println("No. of even integers = " + count2);
  
 	}
}
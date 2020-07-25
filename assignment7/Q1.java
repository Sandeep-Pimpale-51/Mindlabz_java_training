import java.util.*;

	class Q1

  {
		public static <T extends Object & Comparable<? super T>>T max(List<? extends T> list, int begin, int end) 
	{

	        T maxE = list.get(begin);

	        for (++begin; begin < end; ++begin)
        	    if (maxE.compareTo(list.get(begin)) < 0)
            		    maxE = list.get(begin);
        	return maxE;
	}

	public static void main(String[] args)
	{
		List<Integer> ar=Arrays.asList(2,62, 4,78, 6, 10,49,20,59,43,29,30,56,89);
		int value=Q1.max(ar,0,ar.size());
		System.out.println("Maximal element:"+value);
	}
  }
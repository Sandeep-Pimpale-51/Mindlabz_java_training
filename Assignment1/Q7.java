//program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;

class Q7{

	public static void main(String args[])
  {
	int[] setArray=new int[10];
	int evenSum=0,oddSum=0;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter any 10 values::");
	for(int i=0;i<10;i++){
		setArray[i]=sc.nextInt();		
	}

	for(int i=0;i<10;i++)
	{
		if(setArray[i]%2==0)
		{
			evenSum=evenSum+setArray[i];
		}
		else
		{
			oddSum=oddSum+setArray[i];
		
		}
	}
	System.out.println("Sum of Even Integers :"+evenSum);
	
	System.out.println("Sum of Odd Integers :"+oddSum);
 
  }
}
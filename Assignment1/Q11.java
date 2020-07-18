// program to  enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;
class Q11{

	public static void main(String args[])
	{
		
		int num,positive=0,negative=0,zero=0;
		boolean doAgain=true;		
		char ans;
		Scanner sc= new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the number::");
			num=sc.nextInt();
				
			if(num>0)
			{
				positive=positive+1;
			}
			else
			if(num<0)
			{
				negative=negative+1;
			}
			else
			{
				zero=zero+1;
			}
			System.out.println("Do you wishes to input the Another number.(Y/N)");
			ans=sc.next().charAt(0);
			
			if(ans=='N')
			{
				doAgain=false;
			}
		} while(doAgain);	
		
		System.out.println("You have entered "+zero+" zero, "+positive+ " Positive, "+negative+" Negative Values.");		

	}
}
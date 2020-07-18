//  program Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

class Q5
{
	public static void main(String args[])
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[0]);		
		int power=num1;
	
		for(int i=1;i<num2;i++)
		{
			power=power*num1;
		}
		System.out.println(power);
	}
}

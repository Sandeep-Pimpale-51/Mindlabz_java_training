//  program to find the factorial value of any number entered through the keyboard.

class Q4
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
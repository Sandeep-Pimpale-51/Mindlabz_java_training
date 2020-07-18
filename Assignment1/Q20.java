
import java.util.Scanner;
public class Q20
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n,fact;
		float x,sum=0;
		int cosx=-1;
		float prod=1;
		System.out.print("Enter value x:");
		x=sc.nextInt();
		System.out.print("Enter value n:");
		n=sc.nextInt();
		
		for(i=1;i<=n;i+=2)
		{
			fact=1;
			for(j=1;j<=i;j++)
			{
				prod=prod*x;;
				fact=fact*j;
			}
			
			sum=sum+cosx*prod/fact;
			cosx=-1*cosx;
		}
		System.out.print("cos="+(sum+1));
		
	}
}
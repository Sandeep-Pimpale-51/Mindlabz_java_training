import java.util.*;

//class Distance to read, print and add distance
class addDistance
{
	private int feet;
	private int inches;
	
	public void getDistance()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter feet: ");
		feet=sc.nextInt();
		System.out.print("Enter inches: ");
		inches=sc.nextInt();
	}
	public void showDistance()
	{
		System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	}
	
	public void add(addDistance D1, addDistance D2)
	{
		inches=D1.inches+D2.inches;
		feet=D1.feet+D2.feet+(inches/12);
		inches=inches%12;
	}
}

class Q11
{
	public static void main(String []s)
	{
		
			addDistance D1=new addDistance();
			addDistance D2=new addDistance();
			addDistance D3=new addDistance();
			
			//read first distance
			System.out.println("Enter first distance: ");
			D1.getDistance();
			
			//read second distance
			System.out.println("Enter second distance: ");
			D2.getDistance();
			
			//add distances
			D3.add(D1,D2);
			//print distance
			System.out.println("Total distance is:" );
			D3.showDistance();
		
	}
}
//How to convert numeric String to an int?
import java.util.*;

class Q8{

	public static void main(String args[])
	{
		System.out.print("Enter the Number as String: ");
		
		Scanner sc=new Scanner(System.in);
		String strNum=sc.nextLine();
		int num=Integer.parseInt(strNum);
		System.out.println("In Integer Format ::"+num);
	}
}
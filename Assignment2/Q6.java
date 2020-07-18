import java.util.*;
 
class Area{


int length,breadth;

Scanner sc=new Scanner(System.in);
public void setDim(){
		System.out.println("Enter the length :");
		length =sc.nextInt();
		System.out.println("Enter the breadth:");
		breadth=sc.nextInt();
	
}
 public void getArea(){
int results = length * breadth;
System.out.println("RectArea = " +  results);
}
}
class Q6
{
public static void main(String []args){
Area x =new Area();
x.setDim();
x.getArea();
    
}
}
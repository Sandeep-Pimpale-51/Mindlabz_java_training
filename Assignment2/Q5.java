/*5.WAP to print the area of two rectangles having sides (4,5) & (5,8) respectively  by creating a class named 'Rectangle' with a method named 'Area'
which returns the area & length & breadth passed as parameters to its constructor.*/

class Rectangle{
	int length;
	int breadth;
	
	public Rectangle(int l,int b){
		length=l;
		breadth=b;
		
	}
	public int getArea(){
		return length*breadth;
	}
	public int getParameter(){
		return 2*(length+breadth);
	}
}
class Q5{
	public static void main(String[] args)
	{
		Rectangle a=new Rectangle(4,5);
		Rectangle b=new Rectangle(5,8);
		System.out.println("Area and parameter of first rectangle:");
		System.out.println("Area="+a.getArea()+"   "+ "Parameter="+a.getParameter());
	    System.out.println("Area and parameter of second rectangle:");
		System.out.println("Area="+b.getArea()+"   "+ "Parameter="+b.getParameter());
		
		
	}
}

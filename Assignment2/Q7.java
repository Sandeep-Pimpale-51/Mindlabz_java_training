/*7.WAP to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its construtor
 & having a method named 'returnArea' which returns the area of the rectangle. Length & breadth of rectangle are entered through keyboard.*/
 
 import java.util.Scanner;
 class Area{
 int length;
 int breadth;
 public Area(int l, int b){
   length=l;
   breadth=b;
 }
 public int returnArea(){
	 return length*breadth;
 }
 }
 
 class Q7{
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int l,b;
		 System.out.println("Enter length:");
		 l=sc.nextInt();
		 System.out.println("Enter breadth:");
		 b=sc.nextInt();
		 
		 Area a=new Area(l,b);
		 System.out.println("Area:"+a.returnArea());
	 }
 }
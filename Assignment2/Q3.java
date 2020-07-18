//3.WAP to print the area & parameter of triangle having sides of 3,4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
 
  class Triangle{
	 int a,b,c;
	 
	 public double getArea(){
		 double s=(a+b+c)/2;
		 return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	 }
	 public double getParameter(){
		 return(a+b+c)/2.0;
	 }
	 }
	class Q3{
		 public static void main(String[] args){
			 Triangle t=new Triangle();
			 t.a=3;
			 t.b=4;
			 t.c=5;
			 System.out.println("Area:"+t.getArea());
			 System.out.println("Parameter:"+t.getParameter());
		 }
	 }
 
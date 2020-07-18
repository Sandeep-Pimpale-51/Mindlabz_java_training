
  class Triangle{
	 int a,b,c;
	 
	 Triangle(int p,int q,int r){
		a=p;
		b=q;
		c=r;
	}
	 public double getArea(){
		 double s=(a+b+c)/2;
		 return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	 }
	 public double getParameter(){
		 return(a+b+c)/2.0;
	 }
	 }
	 class Q4{
		 public static void main(String[] args){
			 Triangle t=new Triangle(3,4,5);
			
			 System.out.println("Area:"+t.getArea());
			 System.out.println("Parameter:"+t.getParameter());
		 }
	 }
 
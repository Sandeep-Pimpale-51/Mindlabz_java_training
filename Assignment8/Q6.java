class A extends Thread
{
public void run()
{

for(int i=1;i<11;i++)
{
System.out.println(i);
}
}
}
class B extends Thread
{
public void run()
{
for(int j=11;j<21;j++)
{
System.out.println(j);
}
}
}
class Q5
{
public static void main(String args[])
{
A a1=new A();
B b1=new B();
a1.start();
b1.start();
}
}
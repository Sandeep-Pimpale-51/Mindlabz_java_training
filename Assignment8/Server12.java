import java.io.*;  
import java.net.*;  
public class Server12 extends Thread {  
public void run()
{ 
try{  
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();//establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
String  str=(String)dis.readUTF();  
System.out.println("message= "+str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
public static void main(String[] args){ 
MyServer12 m2=new MyServer12();
m2.start();
} 
}  
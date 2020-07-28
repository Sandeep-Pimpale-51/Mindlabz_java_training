import java.io.*;  
import java.net.*;  
public class Clients12 extends Thread {  
public void run()
{ 
try
{ 
Socket s=new Socket("localhost", 6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello Server");  
dout.flush();  
dout.close();  
s.close(); 
} 
catch(Exception e){System.out.println(e);}  
 }
public static void main(String[] args) {  
Clients12 m1=new Clients12();
m1.start();
} 
} 
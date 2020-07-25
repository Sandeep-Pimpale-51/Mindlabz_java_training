import java.io.*; 
import java.util.*;
class Q1
{ 

public static void main(String[] args) throws IOException 
{ 
// Accept a string  
String str = "A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in this spot, which was created for the bliss of souls like mine. I am so happy, my dear friend, so absorbed in the exquisite sense of mere tranquil existence, that I neglect my talents. I should be incapable of drawing a single stroke at the present moment; and yet I feel that I never was a greater artist than now. When, while the lovely valley teems with vapour around me, and the meridian sun strikes the upper surface of the impenetrable foliage of my trees, and but a few stray gleams steal into the inner sanctuary, I throw myself down among the tall grass by the trickling stream; and, as I lie close to the earth, a thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks, and grow familiar with the countless indescribable forms of the insects and flies, then I feel the presence of the Almighty, who formed us in his own image, and the breath of that universal love which bears and sustains us, as it floats around us in an eternity of bliss; and then, my friend, when darkness overspreads my eyes, and heaven and earth seem to dwell in my soul and absorb its power, like the form of a beloved mistress, then I often think with longing, Oh, would I could describe these conceptions, could impress upon paper all that is living so full and warm within me, that it might be the mirror of my soul, as my soul is the mirror of the infinite God! O my friend";
FileWriter fw=new FileWriter("test.txt");  
for (int i = 0; i < str.length(); i++) 
fw.write(str.charAt(i));
System.out.println("Writing successful"); 
fw.close();

int ch; 
FileReader fr=null; 
try{ 
fr = new FileReader("test.txt"); 
} 
catch (FileNotFoundException fe) 
{ System.out.println("File not found"); 
} 


int vowels=0,consonants=0,p=0;
while ((ch=fr.read())!=-1)
{
}

String str1="abcdefghijklmnopqrstuvwxyz";
int len1=str1.length();
int countal=0;
int len2=str.length();
System.out.println("Occurance of characters:");
for(int s=0;s<len1;s++)
{
	countal=0;
	for(int n=0;n<len2;n++)
	{
		if(Character.toLowerCase(str.charAt(s))==Character.toLowerCase(str.charAt(n)))
		{
			countal=countal+1;
		}
	
		
	}
	System.out.println(str1.charAt(s)+" : "+countal);
}

int count = 0;    

           
   
for(int k = 0; k < str.length(); k++) {    
            if(Character.toLowerCase(str.charAt(k)) != ' ')    
            {
               count=count+1;
            }    
            if(Character.toLowerCase(str.charAt(k))== 'a' ||Character.toLowerCase( str.charAt(k)) == 'e' || Character.toLowerCase(str.charAt(k)) == 'i' || Character.toLowerCase(str.charAt(k)) == 'o' || Character.toLowerCase(str.charAt(k)) == 'u') {  
                vowels=vowels+1;
            }
            else
            {
            consonants=consonants+1;
            }
}
    int flag=0,wc=0;;
for(int i=0;i<str.length();i++)  
            {  
                 if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') 
                flag = 1;  

		 else if (flag == 1) 
            { 
                flag=0; 
                ++wc; 
            } 
            }   
System.out.println("Total number of characters in a string: " + count);
System.out.println("Total number of vowels in test.txt file is = " +vowels);
System.out.println("Total number of consonants in test.txt file is = " +consonants);
System.out.println("Total number of words in test.txt file is= " +wc);
FileWriter fw1=new FileWriter("test_copy.txt");  
for (int i = 0; i < str.length(); i++) 
fw1.write(str.charAt(i));
System.out.println("Writing successful"); 
fw1.close();
fr.close(); 
} 
}
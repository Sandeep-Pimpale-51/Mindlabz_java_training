
//program that generates a random number and asks the user to guess what the number is. If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's guess is lower than the random number, the program should display "Too low, try again." The program should use a loop that repeats until the user correctly guesses the random number.

import java.util.Scanner;

 class Q17
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number,guess,tries = 0; 
       
        number = (int) (Math.random() * 100) + 1;
        
        System.out.println("Guess My Number Game");
        System.out.println();
        
        do
        {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = console.nextInt();
                
            tries++;
                
        if (guess > number)
        {
            System.out.println("Too high! Try Again");
        }
        else if (guess < number)
        {
            System.out.println("Too low! Try Again");
        }
        else
        {
	    System.out.println("Correct! You got it in " + tries + " guesses!");
        }
        
        }while (guess != number);
    }  
}
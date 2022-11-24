package de.hfu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("Enter Text: ");  
		
		Scanner sc= new Scanner(System.in);  
		String userInput= sc.nextLine();  
		
		System.out.print(userInput.toUpperCase());
		
		sc.close();
    }
}

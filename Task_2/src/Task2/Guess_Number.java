package Task2;

import java.util.Random;
import java.util.Scanner;

public class Guess_Number {

	public static void main(String[] args) {
	        // Generate a random number between 1 and 100
	        Random random = new Random();
	        int secretNumber = random.nextInt(100) + 1;
	        int attempts = 0;
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.print("Guess the number (between 1 and 100): ");
	            try {
	                // Read user's guess
	                int guess = scanner.nextInt();
	                attempts++;
	                
	                // Check if the guess is correct
	                if (guess == secretNumber) {
	                    System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
	                    break;
	                } else if (guess < secretNumber) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            } catch (Exception e) {
	                System.out.println("Invalid input. Please enter a valid number.");
	                scanner.next(); // Clear the input buffer
	            }
	        }
	        
	        // Close the scanner
	        scanner.close();
	   }
}

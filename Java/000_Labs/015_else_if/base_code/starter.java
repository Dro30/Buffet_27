/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();

	int randomNumber = rand.nextInt(1000) + 1;

	System.out.print("Pick a number between 1 - 1000: ");
	int guess = scan.nextInt();

	if(guess == randomNumber) {
		System.out.println("You guessed it!");
	} else if (guess > randomNumber) {
		System.out.println("Your guess is higher than the random number.");
	} else {
		System.out.println("Your guess is lower than the random number.");
	}

		System.out.println("The number was" + randomNumber + ".");


	}
}

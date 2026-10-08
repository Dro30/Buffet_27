/*
 *	Author:
 *  Date:
 */
import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner var1 = new Scanner(System.in);
		Random var2 = new Random();

		System.out.print("Pick a number 1 - 1000: ");
		int var3 = var1.nextInt();
		int var4 = var2.nextInt(1000) + 1;

		if (var3 == var4) {
			System.out.println("You guessed the correct number! Congrats!");
		} else if (var3 > var4) {
			System.out.println("Your number was higher than the random number.");
		} else {
			System.out.println("Your number was lower than the random number.");
		}

		System.out.println("The random number was " + var4 + ".");
	}
}
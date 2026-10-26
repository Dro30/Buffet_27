/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String[] args) {
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If all three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
		System.out.println("");
		System.out.println("---------------------------------------------");
		System.out.println("");

		Scanner sc = new Scanner(System.in);
		int money = 100;

		System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
		String choice = sc.nextLine();
		if (!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))) {
			System.out.println("Thanks for visiting!");
			sc.close();
			return;
		}
		while (money > 0) {
			System.out.println("You have $100. What would you like your wager to be?");
			int wager = sc.nextInt();
			sc.nextLine();
			while (wager <= 0 || wager > money) {
				System.out.println("Please enter a wager greater than 0 and less than or equal to $" + money + ".");
				wager = sc.nextInt();
				sc.nextLine();
			}

			int a = (int) (Math.random() * 10) + 1;
			int b = (int) (Math.random() * 10) + 1;
			int c = (int) (Math.random() * 10) + 1;

			System.out.print("|" + a + "|" + b + "|" + c + "|");
			if (a == b && b == c) {
				System.out.println(" JACKPOT!!! You win triple your wager!!");
				money += wager * 2;
			} else if (a == b || a == c || b == c) {
				System.out.println(" You got two numbers and you double your wager!!");
				money += wager;
			} else {
				System.out.println(" No matches!! You lose your wager!!");
				money -= wager;
			}

			System.out.println("Current money: $" + money);
			if (money <= 0) {
				System.out.println("You are out of money. Game over!");
				break;
			}
			System.out.print("Do you want to play again? (Yes/yes/Y/y): ");
			String answer = sc.nextLine();

			if (answer.equalsIgnoreCase("no") ||
				answer.equalsIgnoreCase("No")) {
				answer.equalsIgnoreCase("n");
				break;
			}
		}
		sc.close();
	}
}


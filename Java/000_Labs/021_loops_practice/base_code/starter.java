/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int randomnumb = (int)(Math.random()*999)+1;
	System.out.print("Guess a number between 1 and 1000:");
	int guess = sc.nextInt();
	while (guess != randomnumb){
		if(guess > randomnumb){
			System.out.println("Its too high, try again!");
			guess = sc.nextInt();
		}
		if(guess < randomnumb){
			System.out.println(" Its too low, try again");
			guess = sc.nextInt();
		}
		if(guess == randomnumb){
			break;
		}
	}

		
		



		
	}
}

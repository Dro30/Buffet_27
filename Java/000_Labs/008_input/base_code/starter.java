/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your name?");
		String pic = sc.nextLine();
		System.out.println("What is your age?");
		String line = sc.nextLine();
		System.out.print("What month were you born?"); 
		String small = sc.nextLine();
		System.out.println("Name: " + pic + ", Age: " + line + ", Birth month: " + small);


	}
}

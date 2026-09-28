/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int gamble1 = (int)(Math.random()* 9);
		int gamble2 = (int)(Math.random()* 100);
		double gamble3 = (double)(Math.random()* 1 + 2.5);
		double gamble4 = (double)(Math.random()* 589 + 15);

		System.out.println("A number between 0 - 9 " + gamble1);
		System.out.println("A number between 1 - 10 " + gamble2);
		System.out.println("A number between 2.5 - 3.5 " + gamble3);
		System.out.println("A number between 14 - 589 " + gamble4);
		
		 
	}
}

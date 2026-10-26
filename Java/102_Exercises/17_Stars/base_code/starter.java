/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a width: ");
		int width = input.nextInt();
		System.out.println("Please enter a height: ");
		int height = input.nextInt();

		int star = 0;
		while (star < height) {
			
		int count = 0;
		while (count < width) {
		System.out.print("*");
		count++;
		}
		System.out.println();
		star++;
		}
	}
}


		
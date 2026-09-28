/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in); {
		System.out.print("Please input your first number");
		int num1 = sc.nextInt();
		System.out.print("Please input your second number");
		int num2 = sc.nextInt();
		boolean answer = num1 == num2;

		if (answer) {
			System.out.println(num1 + " is equal to " + num2);
		} 
		
		if(num1 != num2){
			System.out.println(num1 + " is not equal to " + num2);
		}
		}
	}
}
	

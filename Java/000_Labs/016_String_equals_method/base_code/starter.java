/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		if (role.equals("Wizard")){
		System.out.println("You have chosen the Wizard! YAYYYYYY.");
		}
		else if(role.equals("Warrior")){
			System.out.println("You have chosen the Warrior! AHHHH!");
		}
		else if(role.equals("Rogue")){
			System.out.println("You have chosen the Rogue! AHHHHH!");
		}

		else{
			System.out.print("You have decided not to chose a role. Rerun program.");
		}

		sc.close();
	}
}

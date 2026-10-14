/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
      String x = "Soccer player:";
      String y = " Basketball player:";
      String z = " Football player:";

      System.out.println("What is your name? ");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println("Hello, " + name + "!");

      System.out.println("What would you like to be?");
      System.out.print(x);
      System.out.print(y);
      System.out.print(z);
      String choice = sc.nextLine();
      String title = "A member";

      if (choice.equals("Soccer player:")) {
            title = "Soccer player";
            System.out.println("You've chosen the Soccer player! GOALLLLLL!!!");
      } else if (choice.equals(" Basketball player:")) {
            title = "Basketball player";
            System.out.println("You've chosen the Basketball player! SWISH!!!");
      } else if (choice.equals(" Football player:")) {
            title = "Football player";
            System.out.println("You've chosen the Football player! TOUCHDOWN!!!");
      } else {
            int money = 30;
            System.out.println("You have 30 skill points to spend in the following: Strength, Speed, Intelligence, and Stamina. Spend them wisely.");

            System.out.print("Strength (1-10): ");
            int strength = sc.nextInt();
            if (strength <= 10) {
                  money = money - strength;
                  System.out.println("You have " + money + " left to spend");
            } else {
                  System.out.print("Please input a smaller value. Strength (1-10): ");
                  strength = sc.nextInt();
                  money = money - strength;
                  System.out.println("You have " + money + " left to spend");
            }

            System.out.print("Speed (1-10): ");
            int speed = sc.nextInt();
            if (speed <= 10) {
                  money = money - speed;
                  System.out.println("You have " + money + " left to spend");
            } else {
                  System.out.print("Please input a smaller value. Speed (1-10): ");
                  speed = sc.nextInt();
                  money = money - speed;
                  System.out.println("You have " + money + " left to spend");
            }

            System.out.print("Intelligence (1-10): ");
            int intelligence = sc.nextInt();
            if (intelligence <= 10) {
                  money = money - intelligence;
                  System.out.println("You have " + money + " left to spend");
            } else {
                  System.out.print("Please input a smaller value. Intelligence (1-10): ");
                  intelligence = sc.nextInt();
                  money = money - intelligence;
                  System.out.println("You have " + money + " left to spend");
            }

            System.out.print("Stamina (1-10): ");
            int stamina = sc.nextInt();
            if (stamina <= 10) {
                  money = money - stamina;
                  System.out.println("You have " + money + " left to spend");
            } else {
                  System.out.print("Please input a smaller value. Stamina (1-10): ");
                  stamina = sc.nextInt();
                  money = money - stamina;
                  System.out.println("You have " + money + " left to spend");
            }

      System.out.println("You are " + name + ", " + title + " of CVHS");
      System.out.println("Your a " + choice + " with the following stats");
      System.out.println("Strength - " + strength);
      System.out.println("Speed - " + speed);
      System.out.println("Intelligence - " + intelligence);
      System.out.println("Stamina - " + stamina);
      System.out.println("Good luck on your amazing journey " + name + "!");
      }
   }
}

      
/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner var1 = new Scanner(System.in);
      System.out.println("What is your name? ");
      String var2 = var1.nextLine();
      System.out.println("What is your title? Ex: Sports");
      String var3 = var1.nextLine();
      System.out.println("Would you like to be a Soccer player, Basketball player, or Football player? ");
      String var4 = var1.nextLine();
      if (!var4.equals(" Soccer player") && !var4.equals("soccer player")) {
         if (!var4.equals("Basketball player") && !var4.equals("basketball player")) {
            if (!var4.equals("Football player") && !var4.equals("football player")) {
               System.out.println("You've decided not to chose a role. Rerun program.");
            } else {
               System.out.println("You've chosen the Footballer! Touchdown!");
            }
         } else {
            System.out.println("You've chosen the Baller! 3 pointer!");
         }
      } else {
         System.out.println("You've chosen the Athlete ! Goalll!");
      }

      System.out.println("");
      System.out.println("You have 30 skill points to spend in the following: Strength, Speed, Intelligence, Stamina. Spend them wisely.");
      int var5 = 30;
      System.out.println("");
      System.out.print("Strength (1-10): ");
      int var6 = var1.nextInt();
      if (var6 <= var5 && var6 <= 10) {
         var5 -= var6;
      } else {
         System.out.print("Please input a smaller value. Strength (1-10): ");
         var6 = var1.nextInt();
         var5 -= var6;
      }

      System.out.println("You have " + var5 + " left to spend.");
      System.out.println("");
      System.out.print("Speed (1-10): ");
      int var7 = var1.nextInt();
      if (var7 <= var5 && var7 <= 10) {
         var5 -= var7;
      } else {
         System.out.print("Please input a smaller value. Speed (1-10): ");
         var7 = var1.nextInt();
         var5 -= var7;
      }

      System.out.println("You have " + var5 + " left to spend.");
      System.out.println("");
      System.out.print("Intelligence (1-10): ");
      int var8 = var1.nextInt();
      if (var8 <= var5 && var8 <= 10) {
         var5 -= var8;
      } else {
         System.out.print("Please input a smaller value. Intelligence (1-10): ");
         var8 = var1.nextInt();
         var5 -= var8;
      }

      System.out.println("You have " + var5 + " left to spend.");
      System.out.println("");
      System.out.print("Stamina (1-10): ");
      int var9 = var1.nextInt();
      if (var9 <= var5 && var9 <= 10) {
         var5 -= var9;
      } else {
         System.out.print("Please input a smaller value. Stamina (1-10): ");
         var9 = var1.nextInt();
         var5 -= var9;
      }

      System.out.println("");
      if (var5 > 0) {
         System.out.println("You have " + var5 + " to spend for next time.");
      }

      System.out.println("--------------------------------------------------");
      System.out.println("You are " + var2 + ", the " + var3 + " of CVHS.");
      System.out.println("You're a " + var4 + " with the following stats!");
      System.out.println("Strength - " + var6);
      System.out.println("Speed - " + var7);
      System.out.println("Intelligence - " + var8);
      System.out.println("Stamina - " + var9);
      System.out.println("");
      System.out.println("Good luck on your sport journey " + var2 + "!");
   }
}

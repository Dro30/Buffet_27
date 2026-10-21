/*
 *	Author:
 *  Date:
 */

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("What is your name?");
	   String bob = sc.nextLine();
       System.out.println("How many times do you want to print");
       int na = sc.nextInt();
       int number = 0;
     while (true){
        System.out.println(bob);
        number++;
        if (na == number){
            break;
        }
    
}
}
}
	
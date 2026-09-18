/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput {
    public static void main(String args[]) {
        // Your Code Goes here!
    System.out.println("Bari jalust em resturante");
    System.out.println("Esa mer untelike:");
    System.out.println("1: Karmer plav - ");
    double item1Price = 7.85;
    System.out.println(item1Price);
 
    System.out.println("2: Shes kabob - ");
    double item2Price = 12.50;
   System.out.println(item2Price);
    
    System.out.println("3: Lamb chop - ");
   double item3Price = 15.12;
   System.out.println(item3Price);
    
    Scanner sc = new Scanner(System.in);
    System.out.println("How many karmer plav would you like?");
    int item1Quantity = sc.nextInt();
    System.out.println("Item 1 Total is: " + (item1Price * item1Quantity));
    
    
    System.out.println("How many shes kabob would you like?");
    int item2Quantity = sc.nextInt();
    System.out.println("Item 2 Total is: " + (item2Price * item2Quantity));
    
    System.out.println("How many lamb chop would you like?");    
    int item3Quantity = sc.nextInt();     
    System.out.println("Item 3 Total is: " + (item3Price * item3Quantity));
    
    double total = (item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity);
    System.out.println("How much is your tip?");
    double tip = sc.nextDouble();
    
    tip = tip / 100 * grandTotal;
    
    System.out.println("Your total is: " + (grandTotal + tip));
    



    }
}

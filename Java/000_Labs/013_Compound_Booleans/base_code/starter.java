

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x >= y && x >= z) {
            System.out.println(x + " is the biggest");
        } if (y >= x && y >= z) {
            System.out.println(y + " is the biggest");
        } if (z >= x && z >= y) {
            System.out.println(z + " is the biggest");
        }

       
    }
}

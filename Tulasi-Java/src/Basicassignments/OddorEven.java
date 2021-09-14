package Basicassignments;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        System.out.println(" Enter a number to check whether a number is Even or Odd :");
        int num =myscannerobj.nextInt();
        while (!myscannerobj.hasNextInt()) {
            String input = myscannerobj.next();
            System.out.println("That's not a number!");
        }
        if (num % 2 == 0)
            System.out.println(" It's an Even number ");
        else
            System.out.println(" It's an Odd number ");
        myscannerobj.close();

    }
}

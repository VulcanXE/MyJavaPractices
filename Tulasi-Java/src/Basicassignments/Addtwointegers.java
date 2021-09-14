package Basicassignments;

import java.util.Scanner;

public class Addtwointegers {
    public static void main(String[] args) {//main method
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        int i, j;//datatypes
        System.out.println("Enter i value: ");
        i = myscannerobj.nextInt();
        if (i <= 0) {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");
            }
            i = myscannerobj.nextInt();
        }
        while (i <= 0) ;

        System.out.println("Enter j value: ");
        j = myscannerobj.nextInt();
        if (j <= 0) {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");

            }
            j = myscannerobj.nextInt();
        }
        while (j <= 0) ;
        int sum = i + j;
        System.out.println("Total of Adding two integers : " + sum);
        myscannerobj.close();//Scanner Close
    }
}



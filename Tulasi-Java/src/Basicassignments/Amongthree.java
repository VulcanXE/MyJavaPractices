package Basicassignments;

import java.util.Scanner;

public class Amongthree {
    public static void main(String[] args) {//main method
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        int a, b, c;
        System.out.println("Enter the numbers a: ");
        a = myscannerobj.nextInt();
        System.out.println("Enter the numbers b: ");
        b = myscannerobj.nextInt();
        System.out.println("Enter the numbers c: ");
        c = myscannerobj.nextInt();
        if ((a > c) && (a > b)) {
            System.out.println(a + " " + "is largest among the three numbers.");
        } else if (b > c) {
            System.out.println(b + " " + "is largest among the three numbers.");
        } else {
            System.out.println(c + " " + "is largest among the three numbers.");

        }
        System.out.println();
        myscannerobj.close();//Scanner Close
    }

}


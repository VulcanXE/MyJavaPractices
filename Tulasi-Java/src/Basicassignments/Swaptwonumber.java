package Basicassignments;

import java.util.Scanner;

public class Swaptwonumber {
    public static void main(String[] args) {
        float i, j, k;
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        System.out.println("Enter i & j values : ");
        i = myscannerobj.nextFloat();
        if (i <= 0) {//Validation
            System.out.println("Please enter a positive number! ");
            while (!myscannerobj.hasNextInt()) {
                String input = myscannerobj.next();
                System.out.println("That's not a number!");

            }
            i = myscannerobj.nextInt();
            j = myscannerobj.nextFloat();
            System.out.println("Before swapping the numbers: " + i + " " + j);
            k = i;
            i = j;
            j = k;
            System.out.println("After swapping: " + i + " " + j);
            myscannerobj.close();//Scanner Close
        }
    }}

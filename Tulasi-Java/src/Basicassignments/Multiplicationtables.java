package Basicassignments;

import java.util.Scanner;

public class Multiplicationtables {
    public static void main(String[] args) {
        System.out.println("Enter the number for which table to dipaly :");
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        int count = 1;
        int total = 1;
        for (count = 1; count <= 10; count++) {
            total = table * count;
            System.out.println(count + " * " + table + " = " + total);
            sc.close();
            //total = (table + 1) * count;
            //  System.out.println("      " + count + " * " + (table + 1) + " = " + total);
        }
    }
}

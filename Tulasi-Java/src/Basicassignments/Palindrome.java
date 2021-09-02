package Basicassignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        sc.close();
        int num, rev, total = 0;
        num = num1;
        while (num1 > 0) {
            rev = num1 % 10;
            total = (total * 10) + rev;
            num1 = num1 / 10;
        }
        if (num == total)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

}
package Basicassignments;

import java.util.*;

public class GCDoftwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number1, Number2;
        System.out.println("Enter the first number : ");
        Number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        Number2 = sc.nextInt();
        int gcd = 1;

        int LeastNo = Number1<Number2?Number1:Number2;

        for (int i = 1; i <= LeastNo; i++) {

            if (Number1 % i == 0 && Number2 % i == 0)
                 gcd = i;
        }

        System.out.printf("Gcd of %d and %d is:%d", Number1, Number2, gcd);
        sc.close();

    }
}







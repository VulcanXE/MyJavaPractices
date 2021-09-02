package Basicassignments;

import java.util.*;

public class LCDoftwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number1, Number2;
        System.out.println("Enter the first number : ");
        Number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        Number2 = sc.nextInt();
        int LCD = 1;
        int GCD = 1;

        int HighNo =  Number1<Number2?Number2:Number1;
        int LeastNo = Number1<Number2?Number1:Number2;

        for (int i = Number1 * Number2; i >= HighNo; i--) {
            if (i % Number1 == 0 && i % Number2 == 0)
                LCD = i;
        }
        int j = 1;
        while ( j <= LeastNo) {

            if (Number1 % j == 0 && Number2 % j == 0)
                GCD = j;
            j++;
        }

        System.out.printf("LCD of %d and %d is:%d", Number1, Number2, LCD);
        System.out.printf("\nGCD of %d and %d is:%d", Number1, Number2, GCD);
        sc.close();
    }
}

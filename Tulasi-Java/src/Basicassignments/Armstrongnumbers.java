package Basicassignments;

import java.util.Scanner;

public class Armstrongnumbers {
    public static void main(String args[]) {
        int num, temp, total = 0;
        int num1 = 0;
        System.out.println(" Enter number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        num = num1;
        for (; num != 0; num/=10) {
            temp = num % 10;
            total = total + temp*temp*temp;
        }
        if (total == num)
            System.out.println("Is an Armstrong number");
        else
            System.out.println("Is not an Armstrong number");
    }
}

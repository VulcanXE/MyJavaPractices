package Basicassignments;

import java.util.Scanner;

public class Factorialofanumber {
    public static void main(String[] args) {
        System.out.println("Factorial of :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        int a = 1;

        {
            for (a = 1; a <= num; a++) {

                while (a <= num) {
                    factorial = factorial * a;
                    a++;

                }
            }
            System.out.println(factorial);
            sc.close();
        }
    }
}
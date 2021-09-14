package assignment1;

import java.util.Scanner;

public class Addint {
    public static void main(String[] args) {
        Scanner Object = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int x = Object.nextInt();

        System.out.println("Enter the second Integer: ");
        int y = Object.nextInt();

        int sum = x + y;
        System.out.println("Sum of two no is: " + sum);
        Object.close();
    }

    static int validate(Scanner object) {
        return 0;

    }
}

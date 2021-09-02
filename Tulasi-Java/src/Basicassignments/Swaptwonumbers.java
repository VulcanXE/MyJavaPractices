package Basicassignments;

import java.util.Scanner;

public class Swaptwonumbers {
    public static void main(String[] args) {
        int x, y;//swap x and y
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the numbers x and y :");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(" Before swapping numbers " + x + " " + y);
        System.out.println(" After swapping numbers " + y + " " + x);
        sc.close();

    }
}

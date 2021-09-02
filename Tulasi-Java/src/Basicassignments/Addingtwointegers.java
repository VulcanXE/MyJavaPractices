package Basicassignments;

import java.util.Scanner;

public class Addingtwointegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n + m;
        {
            System.out.println("n +" + " m =" + sum);
            sc.close();
        }
    }
}

package Basicassignments;

import java.util.Scanner;

public class Largestamongthethree {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println(" Enter a,b,c values: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c)
                System.out.println("a");
            else
                System.out.println("c");

        } else {
            if (b > c)
                System.out.println("b");
            else
                System.out.println("c");
            sc.close();

        }
    }
}
/*
 result = ((a > b)
                      ? (a > c)
                            ? a
                            : c
                      : (b > c)
                            ? b
                            : c);
        System.out.println("Max of three numbers = "
                           + result);

-------------------------------------------------------------------
if((i > j) && (i > k)){
            System.out.println( i + "is the largest Number");

        }
        else if( j > k)
        {
            System.out.println( j + "is the largest Number");
        }
        else{
            System.out.println( k + "is the largest Number");
        }
 */
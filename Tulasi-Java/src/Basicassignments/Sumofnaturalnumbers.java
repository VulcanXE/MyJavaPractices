package Basicassignments;

import java.util.Scanner;

public class Sumofnaturalnumbers {//s=(n(n+1))/2

    public static void main(String[] args) {
        System.out.println("Sum of natural number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int natural = 0;
        int i = 1;

            for (i = 1; i < num; i++) {

                while (i <= num) {
                  natural =natural+i;
                    i++;

               }
            }
        System.out.println(natural);
            sc.close();

        }

    }



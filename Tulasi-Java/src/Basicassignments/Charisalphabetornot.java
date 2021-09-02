package Basicassignments;

import java.util.Scanner;

public class Charisalphabetornot {
    public static void main(String[] args) {

        System.out.println("Enter a Character : ");
        Scanner sc=new Scanner(System.in);
        char character=sc.next().charAt(0);
        if((character >= 'a' && character >= 'z')||(character >= 'A' && character >= 'Z'))
        System.out.println("It's an alphabet ");
        else
        System.out.println("It's not an alphabet ");
        sc.close();

    }
}

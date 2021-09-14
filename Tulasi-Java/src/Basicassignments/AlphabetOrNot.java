package Basicassignments;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {//main method
        System.out.println("Enter a Character : ");
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        char character=myscannerobj.next().charAt(0);
        if((character >= 'a' && character >= 'z')||(character >= 'A' && character >= 'Z'))
            System.out.println("It's an alphabet ");
        else
            System.out.println("It's not an alphabet ");
        myscannerobj.close();//scanner close


    }
}

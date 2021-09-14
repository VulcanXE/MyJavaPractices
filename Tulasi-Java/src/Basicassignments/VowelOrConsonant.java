package Basicassignments;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {//main method
        Scanner myscannerobj = new Scanner(System.in);//Scanner
        System.out.println("Enter a Alphabet: ");
        char letter=myscannerobj.next().charAt(0);
        switch (letter){
            case 'a','e','i','o','u':
                System.out.println("It's an Vowel. ");
                break;
            case 'A','E','I','O','U':
                System.out.println("It's an Vowel. ");
                break;
            default:
                System.out.println("It's an Consonant. ");
                myscannerobj.close();//Scanner Close

        }
    }
}

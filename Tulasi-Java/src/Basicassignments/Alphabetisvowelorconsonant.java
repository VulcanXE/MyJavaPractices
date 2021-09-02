package Basicassignments;


import java.util.*;

public class Alphabetisvowelorconsonant {
    public static void main(String[] args) {
        System.out.println(" Enter an Alphabet :");
        Scanner sc = new Scanner(System.in);

        char alphabet = sc.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')

            System.out.println("It's an Vowel. ");
        else
            System.out.println("It's an Consonant. ");
        sc.close();

    }

}


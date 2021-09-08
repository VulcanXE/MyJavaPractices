package Assignment1;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
       // int a=4;
        //int b=8;
        //System.out.println(a/b);
        //System.out.println(a%b);
        Scanner s = new Scanner(System.in);
        System.out.println( "enter an integer :" );
        int a = s.nextInt();
        System.out.println( "enter an integer1 :" );
        int b = s.nextInt();
        System.out.println("quotient" + a/b);
        System.out.println("remainder" + a%b);

        s.close();


    }
    
}

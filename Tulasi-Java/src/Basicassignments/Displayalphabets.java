package Basicassignments;

public class Displayalphabets {
    public static void main(String[] args) {
        int i;
        for(i=0;i<=65;i++);
        {
            System.out.println((char) (65 + i) + " ");
        }
        System.out.println( );
        for (char alph ='a';alph <='z';alph++){
            System.out.print(alph+" ");
        }
        System.out.println(" ");
        for (char alph ='A';alph <='Z';alph++) {
            System.out.print(alph + " ");
        }

    }
}

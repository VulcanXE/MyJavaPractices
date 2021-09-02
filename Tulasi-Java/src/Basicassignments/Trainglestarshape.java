package Basicassignments;

public class Trainglestarshape {
    public static void main(String[] args) {
        int i;
        int Star = 1;
        int lines = 6;
        for (i = 1; i <= lines; i++) {//lines

            for (int j = lines; j > i; j--) {//space
                System.out.print(" ");
            }
            for (int k = 1; k <= Star; k++) {//stars

                System.out.print("*");
            }
            Star = Star + 2;
            System.out.println();
        }

    }
}

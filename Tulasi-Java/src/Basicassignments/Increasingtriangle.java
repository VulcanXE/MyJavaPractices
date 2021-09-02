package Basicassignments;

public class Increasingtriangle {
    public static void main(String[] args) {
        int i, j;

        int lines = 5;
        for (i = 1; i <= lines; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
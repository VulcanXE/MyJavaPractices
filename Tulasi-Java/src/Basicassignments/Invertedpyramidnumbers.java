package Basicassignments;

public class Invertedpyramidnumbers {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int m = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(m++ + " ");
            }
            System.out.println();

        }

    }
}

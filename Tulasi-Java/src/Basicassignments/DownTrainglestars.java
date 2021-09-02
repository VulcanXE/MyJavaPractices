package Basicassignments;

public class DownTrainglestars {
    public static void main(String[] args) {
    int l;
    int stars = 9;
    int line = 5;
    for (l = 1; l <= line; l++) {
        for (int m = 1; m <= l; m++) {
            System.out.print(" ");
        }
        for (int n = 1; n <= stars; n++) {
            System.out.print("*");
        }
        stars = stars - 2;
        System.out.println();
    }

}
}


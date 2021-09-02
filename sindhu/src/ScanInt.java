import java.util.Scanner;
public class ScanInt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int data = input.nextInt();
        System.out.println("The integer value is: " + data);
        input.close();

    }
    
}

import java.util.Scanner;
public class ScanDoub{
    public static void main (String[] args){
        Scanner data1 = new Scanner(System.in);
        System.out.println("Enter Double value : ");

        Double value = data1.nextDouble();
        System.out.println("The Double value is : " + value);
        data1.close();
    }
}
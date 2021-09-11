package Assignment1;
import java.util.Scanner; 
public class AddtwointegersusingScan{
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //create an object

    System.out.println("Enter an integer  : "  );
   int data1 = input.nextInt(); // reads input from the user

    //System.out.println("Using nextInt(): " + data1);

   //Scanner input1 = new Scanner(System.in);

    System.out.println("Enter an integer 1 : " );
    int data2 = input.nextInt(); //reads input from the user

    //System.out.println("Using nextInt(): " + data2);

    int data3 = data1 + data2;
    System.out.println("Add two integers " + data3);
    input.close(); 
    //input1.close();
 }
}

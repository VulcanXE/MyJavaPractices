import java.util.Scanner;
class Scannerpractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");

    // takes input from the keyboard
    String name = input.nextLine();

    // prints the name
    System.out.println("My name is " + name);

    // closes the scanner
    input.close();
  }

    

    
}

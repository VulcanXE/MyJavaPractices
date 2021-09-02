package BasicsAssignment.NumberPrograms;

import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args)
    {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter values for A and B");
        int a = AddTwoNumbers.validate(scannerObj);
        int b = scannerObj.nextInt();
        System.out.println("SUM OF A and B is "+(a + b));
        scannerObj.close();
    }

    static int validate(Scanner scannerObj){
        int num;
        do{
            System.out.println("Enter positive Number:");
            while(!scannerObj.hasNextInt()){
                System.out.println("This is not a Number.Please enter positive Number:");
                scannerObj.next();
            }
            num = scannerObj.nextInt();
        }while(num <= 0);
      return num;
    }
}

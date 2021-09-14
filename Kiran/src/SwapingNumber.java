import java.util.Scanner;

public class SwapingNumber {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int A;
        do{
            System.out.println("Enter A value");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("This is not a valid Number . Input a valid number");
                scannerObj.next();
            
            }
            A = scannerObj.nextInt();

            }while(A <= 0);

            int B;
            do{
                System.out.println("Enter B value");
                while(!scannerObj.hasNextInt())
                {
                    System.out.println("This is not a valid Number . Input a valid number");
                    scannerObj.next();
                }
                B = scannerObj.nextInt();
            }while(B <= 0);

            int T;
            T = A;
            A = B;
            B = T;
            System.out.println("Swaping of Two Numbers : "+ A +" , "+ B);
            scannerObj.close();

        }


        
    }
    


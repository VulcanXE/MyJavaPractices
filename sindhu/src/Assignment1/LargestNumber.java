package Assignment1;

//import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
       /* Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();
        System.out.println("enter second number");
        int y = input.nextInt();
        System.out.println("enter third number");
        int z = input.nextInt();
        int t = x>y?x:y;
        int s=z>t?z:t;              //using ternery operator
        //s = z>(x>y?x:y)?z:(x>y?x:y);
        System.out.println("the largest number is" +s);
        input.close();*/


      //using elseif
        int a=50,b=30,c=80;
      /*  if(a>b&&a>c){
            System.out.println("a is the largest number");
        }
            else if (b>a&&b>c){
                System.out.println("b is the largest number");
             } else{
                 System.out.println("c is the largest number");
             }
*/

//nested if
if(a>b)
{
    if(a>c){
        System.out.println("largest number a");
    }
    else if(b>a){
        if(b>c){
            System.out.println("b is the largest number");
        }
    }
    else {
        System.out.println("c is the largest");
    }

}


            
        



         

        
        
    }
    
}

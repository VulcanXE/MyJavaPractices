
import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       
        System.out.println("enter your name");
        String name=obj.next();

        System.out.println("your name is :   "+name);
        obj.nextLine();
        
        System.out.println("enter your gender m/f:  ");
        //char gender='f';
        obj.next().charAt(0);

        System.out.println("enter your marital status ");
        String status="married";
        obj.next();
        switch(status){
            case "married":
            System.out.println("you are married");
            break;
            case "unmarried":
            System.out.println("you are unmarried");
            break;
            default:
            System.out.println("child");
        }
        
        System.out.println("enter your age");
        int age=obj.nextInt();

        String s="voter";
        if(age<=17)
        System.out.println("minor");
            if(age>18 && age<=60)
              System.out.println("in service voter");
           else
           System.out.println("senior citizen");
            obj.nextLine();
     
      /*  System.out.println("enter your gross income:$  ");
        obj.nextLong();

        System.out.println("your net income is:    ");
        obj.nextFloat();
        //boolean b=true;
        //obj.nextLine();
        
        
        obj.nextBoolean();
        System.out.println("i consent");*/




        obj.close();
    }
    
}

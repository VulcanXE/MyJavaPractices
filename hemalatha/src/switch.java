
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        int choice;
        java.lang.String order;
        Scanner sc = new Scanner(System.in);
        System.out.println("items");
        System.out.println("1. tea");
        System.out.println("2. coffee");
        System.out.println("3. milk");
         
        System.out.println("enter choice(1-3):");
        choice = sc.nextInt();

        switch(choice)
        {
            case 1 :
            order = "tea";
            break;
            case 2 :
            order = "coffee";
            break;
            case 3 :
            order = "milk";
            break;
            default:
            order = "cool drink";
        }
        System.out.println("your order" +order);
    }
    
}

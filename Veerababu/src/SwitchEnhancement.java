import java.util.Scanner;
public class SwitchEnhancement{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("No of Fruits");
        int No = obj.nextInt();
        System.out.println("Fruits Name");
        String Name = obj.nextLine();
        System.out.println("Location");
        String Location = obj.nextLine();

        switch(No){
            case 2:
            System.out.println("2 apples");
            break;
            case 4:
            System.out.println("4 Numbers");
            switch(Name){
                case "Apple":
                System.out.println("Fruit Name 111");
               // System.out.println(Location);
                break;
                case "Banana":
                System.out.println("Fruit Name is"+" "+ Name);
                break;
            }
            break;
            case 8:
            System.out.println("6 apples");
            break;
            default:
            System.out.println("Invalid Statement");
        }
        System.out.println(Name);
    }
    
}
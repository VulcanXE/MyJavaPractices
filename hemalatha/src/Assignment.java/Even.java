import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
      Scanner Obj = new Scanner(System.in);
        System.out.println("enter the number");
        int num = Obj.nextInt();
        if(num % 2 == 0)
        System.out.println(num+ "even number");
        else
        System.out.println(num+ "odd number");
        Obj.close();
        
    }

    
}

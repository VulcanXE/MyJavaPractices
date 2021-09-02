public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("before swap");
        System.out.println("first number =" +a) ;
        System.out.println("second number =" +b);
        a = a-b;
        b = a+b;
        a = b-a;
        System.out.println("after swap");
        System.out.println("first number =" +a);
        System.out.println("second number =" +b);

    }
    
}

public class Increment {
    public static void main(String[] args) {
       int a =10;
       System.out.println(a-- + a--); // (10-1=9)+(10)=19
        int b=10;
        System.out.println(--b + --b); // (1-10=9)+
        int c=10;
        System.out.println(c++ + c++);
         int d=10;
        System.out.println(++d + ++d);
        int e=10;
        System.out.println(e++ + ++e);
        int i=10;
        System.out.println(i++ + --i);
        int j=10;
        j++;
        System.out.println(j);
        --j;
        System.out.println(j);
    }
    
}

public class App {
    int b = 48;
    int c = 34;
    float h =200;
    static int z=39;
    static final double PI = 3.14 ;
    public static void main(String[] args) throws Exception {
       /* System.out.println("Hello, World!");
        System.out.println("hi");
        int a =50 ;
        System.out.println("a");
        App sampleobj = new App();
        System.out.println(sampleobj.b + "  " +a +"  "+sampleobj.h);
       // System.out.println("App-" +z);
        System.out.println(z);
    
      
         int d =34;
      
         System.out.println(d);*/
         //looping constructs//
         char rows = 'e';
         aa:
                  for (char a = rows ; a >= 'a'; a-- ) {
                      System.out.println(a);
                      bb:
                      for (char f = 'a'; f <= a; f++){
                         System.out.print(" "+f);
                         break bb;
                      }
                      System.out.println();
         }
    } 
    
}



public class Loops {

    // simple for loop
    public static void main(String[] args) {
        int i= 5;
        int j = 10;
       /* Scanner scObj = new Scanner(System.in);
        i = scObj.nextInt();
        char j = scObj.next().charAt(0);
        // we don't have a nextChar method in java to read char values we need to write like above
        //next is string method to read string data of single token only
        for(i=0;i<=5;i++)
        System.out.println(i);
        System.out.println(scObj);
        scObj.close();*/
        for(i=0;i<=5;i++){
            System.out.println(i);
        }
        // nested for loop 
        for(i=0;i<=5;i++){
           // System.out.print(" +");
            for(j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.print(" *");
            System.out.println();// for new line
        }

        // Labeled for loop
        aa:
         for(i=1;i<=5;i++){
        //} if we close the blck we cant brk this statement because the label(aa) scope is inside the blck
          cc:
           for(j=1;j<=10;j++){
            //System.out.println(j);
       /*break bb; no need of brk for label
        bb here because if we close the inner for loop it automatically scope of label closed*/
        if(i==4&&j==4)
             break aa;
    /*in inner loop we can brk the outer loop execution, 
        but we can't brk inner loop label in outer loop*/
        }

        System.out.println(i+" "+j);
    }

    }
    
}

/*import java.util.Scanner;

public class NestedForLoopLabel {
    public static void main(String[] args) {
        int num, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an interger: ");
        num = sc.nextInt();
        System.out.println("Enter an interger: ");
        num2 = sc.nextInt();
        int i, j;
        label1:
        for (i = 1; i <= num; i++) {
            System.out.println();
            label2:
            for (j = 1; j <= num2; j++) {
                System.out.print(j + "");

                if (j == 11)
                    break;//label1;

            }
        }
    }
}*/

import java.util.Scanner;

public class NestedForLoopLabel {
    public static void main(String[] args) {
        int num=1, num2 , sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of num :");
        num = sc.nextInt();
        num2= sc.nextInt();
        for(sum=0;num<=num2;++num)
        {//System.out.println("Enter value of num :" +num);
            sum=sum+num2;
        }
        System.out.println("The sum of the numbers is : " +sum);
    }
}
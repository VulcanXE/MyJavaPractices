import java.util.Scanner;
public class StudentPractice {

    int roll_no = 2;
    String name;
    long phone_no;
    public static void main(String[] args) {

        StudentPractice stu = new StudentPractice();
        StudentPractice stu1 = new StudentPractice();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name 1");
        stu.name = sc.nextLine();
        stu.roll_no=1;
        System.out.println("Enter phone number");
        stu.phone_no = sc.nextLong();
        System.out.println("Enter name 2");
        stu1.name=sc1.nextLine();
        stu1.roll_no=2;
        System.out.println("Enter phone number");
        stu1.phone_no = sc1.nextLong();
        System.out.println(stu.roll_no+ " "+stu.name+ " "+stu.phone_no);
        System.out.println(stu1.roll_no+ " "+stu1.name+ " "+stu1.phone_no);

    }
}

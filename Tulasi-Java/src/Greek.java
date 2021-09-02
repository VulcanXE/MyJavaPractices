public class Greek {
         public static void main(String[] args)
        {

            Person obj1 = new Person();
            Person obj2 = new Boy();
            Person obj3 = new Girl();

            // As obj is of type person, it is not an
            // instance of Boy or interface
            System.out.println("obj1 instanceof Person: "
                    + (obj1 instanceof Person));
            System.out.println("obj1 instanceof Boy: "
                    + (obj1 instanceof Boy));
            System.out.println("obj1 instanceof MyInterface: "
                    + (obj1 instanceof MyInterface));

                        System.out.println("obj3 instanceof Person: "
                    + (obj3 instanceof Person));
            System.out.println("obj3 instanceof Boy: "
                    + (obj3 instanceof Boy));
            System.out.println("obj3 instanceof MyInterface: "
                  + (obj3 instanceof MyInterface));

            // Since obj2 is of type boy,
            // whose parent class is person
            // and it implements the interface Myinterface
            // it is instance of all of these classes
           /* System.out.println("obj2 instanceof Person: "
                    + (obj2 instanceof Person));
            System.out.println("obj2 instanceof Boy: "
                    + (obj2 instanceof Boy));
            System.out.println("obj2 instanceof MyInterface: "
                  + (obj2 instanceof MyInterface)); */
        }
    }

    class Person {
    }

    class Boy extends Person implements MyInterface {
    }

    class Girl extends Person {
     }

    interface MyInterface {
    }


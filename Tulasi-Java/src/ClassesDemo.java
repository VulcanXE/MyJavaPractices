class Car {//class
    int size;
    String model;

    void speed() {//method
        System.out.println("Speed of my car is 120KMPL");
    }

    void size() {
        System.out.println("X volume of size");
    }

    public static class ClassesDemo {//class
        int num;//variables
        String name;//instance variable


        void display() {//method
            System.out.println("Demo of classes");

        }

        public static void main(String[] args) {
            int i = 10;
            ClassesDemo demoobj = new ClassesDemo();//object (new),ClassesDemo(Constructors)
            System.out.println(demoobj.name + " " + demoobj.num + " " + i);
            demoobj.display();

            Car demo2 = new Car();
            demo2.speed();
            demo2.size();

        }

    }
}
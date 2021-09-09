public class SwitchEnhancements {

    static short a = 15;

    public static void main(String[] args) {
        int i = 33;
        String month = "  ";
        char ch = 'B';
        long j = 33;

        switch (i) {

            case 'B' -> {
                System.out.println(ch);
                break;
            }
            case 1 -> {
                if (j >= i)
                    System.out.println("Print j value" +" "+ j);
                else
                    System.out.println("Print j value" +" "+ i);
                break;
            }

            case 2 -> {
                System.out.println(66 + ch);
                break;
            }
            case 33->{//scope
                int num=20;
                System.out.println(num);
                break;
            }

            default->
                System.out.println(" default");
        }
    }
}


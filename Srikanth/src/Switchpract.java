public class Switchpract {
    public static void main(String[] args) {
        int week = 4;
        String weekString = "";
        switch (week) {
            case 1:
                weekString = "1-monday";
                break;
            case 2:
                weekString = "2-tuesday";
                break;
            case 3:
                weekString = "3-wednesday";
                break;
            case 4:
                weekString = "4-thrusday";
                break;
            case 5:
                weekString = "5-friday";
                break;
            case 6:
                weekString = "6-saturday";
                break;
            case 7:
                weekString = "7-sunday";
                break;
            default:
                System.out.println("Please enter in between 1-7:");
        }
        System.out.println(weekString);
    }
}

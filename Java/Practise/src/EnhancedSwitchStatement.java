public class EnhancedSwitchStatement {
    public static String getQuarter(String month) {
        switch (month) {
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";
        }
        return "bad";
    }

    public static void main(String[] args) {
        int switchvalue = 3;

        switch (switchvalue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actuallyi it was a " + switchvalue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, 5");
        }
        System.out.println(getQuarter("December"));

    }
}

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long years;
            long days;
            long remainingDays;
            long hours;

            hours = minutes / 60;
            days = hours / 24;
            remainingDays = days % 365;
            years = days / 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
        System.out.println("Case 1");
        printYearsAndDays(525600);
        System.out.println("Case 2");
        printYearsAndDays(1051200);
        System.out.println("Case 3");
        printYearsAndDays(561600);
    }
}

public class SpeedConverter {

    // toMilesPerHour method
    public static long toMilesPerHour(double kilometersPerHour) {
        double kmh = kilometersPerHour;
        kmh = kilometersPerHour / 1.609;
        long rounded = Math.round(kmh);

        if (kilometersPerHour >= 0 ) {
            System.out.println(rounded);
        }
        else {
            return -1;
        }
        return rounded;
    }

    // printConversion method
    public static void printConversion(double kilometersPerHour) {

        double kmh = kilometersPerHour;
        kmh = kilometersPerHour / 1.609;

        long rounded = Math.round(kmh);
        if (kmh >= 0) {
            System.out.println(kilometersPerHour + " km/h" + " = " + rounded + " mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }
    }

    // main method
    public static void main(String[] args) {
        toMilesPerHour(1.5);
        printConversion(100);
    }
}
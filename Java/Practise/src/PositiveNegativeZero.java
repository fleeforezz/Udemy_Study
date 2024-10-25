public class PositiveNegativeZero {
    public static void checkNumber(int number) {        // checkNumber method
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {            // main method
        checkNumber(0);
    }
}

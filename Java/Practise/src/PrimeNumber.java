public class PrimeNumber {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                counter++;
                if (counter == 3) {
                    System.out.println("Found 3");
                    break;
                }
            }
        }
        System.out.println("Total of prime number: " + counter);
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}

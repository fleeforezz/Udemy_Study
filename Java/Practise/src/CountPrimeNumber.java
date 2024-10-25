import java.util.Arrays;

public class CountPrimeNumber {

    public static int printElementInArray(int[] arr) {

        for (int i = 0; i<arr.length; i++) {
            System.out.println("Index at " + i + ":" + arr[i]);
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];



        System.out.println(printElementInArray(arr));
    }
}

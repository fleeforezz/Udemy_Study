public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int result) {
        if (num1 + num2 == result) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 2));
    }
}

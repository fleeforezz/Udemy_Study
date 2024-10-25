public class TeenNumberChecker {

    // hasTeen method
    public static boolean hasTeen(int age1, int age2, int age3) {
        if (age1 >= 13 && age1 <= 19 || age2 >= 13 && age2 <= 19 || age3 >= 13 && age3 <= 19) {
            return true;
        }
        else {
            return false;
        }
    }

    // isTeen method
    public static boolean isTeen(int range) {
        if (range >= 13 && range <= 19) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("hasTeen Method: " + hasTeen(22, 23, 34));
        System.out.println("isTeen method: " + isTeen(0));
    }
}

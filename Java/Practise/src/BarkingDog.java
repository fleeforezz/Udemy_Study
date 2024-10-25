// 1. check day time
// 2. check hour of day
// 3. check if the dog barking or not
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // check day time
        if (hourOfDay < 0 && hourOfDay > 23) {
            return false;
        } else if (!barking) {
            return true;
        } else if (hourOfDay < 8 && hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
    }
}


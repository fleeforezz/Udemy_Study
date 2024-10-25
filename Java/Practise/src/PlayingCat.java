public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer) && (temperature >= 25 && temperature <= 45) || (temperature >= 25 && temperature <= 35)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Case 1");
        System.out.println(isCatPlaying(true, 10));

        System.out.println("Case 2");
        System.out.println(isCatPlaying(false, 36));

        System.out.println("Case 3");
        System.out.println(isCatPlaying(false, 35));

        System.out.println("Case 4");
        System.out.println(isCatPlaying(false, 25));
    }
}

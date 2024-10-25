public class SwitchCaseChallenge {
    public static String getAlphabet(String input) {
        switch (input) {
            case "A":
                return "Able";
            case "B":
                return "Baker";
            case "C" :
                return "Charlie";
            case "D":
                return "Dog";
            case "E":
                return "Easy";
            default:
                return "Not found";
        }
    }

    public static void main(String[] args) {
        System.out.println(getAlphabet("P"));
    }
}

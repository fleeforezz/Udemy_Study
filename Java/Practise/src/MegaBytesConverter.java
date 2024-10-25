public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int remained;
        if (kiloBytes >= 0) {
            megaBytes = kiloBytes / 1024;
            remained = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB" + " = " + megaBytes + " MB" + " and " + remained + " KB");
        }
        else {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}

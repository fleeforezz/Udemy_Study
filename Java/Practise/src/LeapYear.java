//        A leap year has 366 days (the extra day is the 29th of February), and it
//        comes after every four years. To check if a year is a leap year, divide the
//        year by 4. If it is fully divisible by 4, it is a leap year. For example, the year
//        2016 is divisible 4, so it is a leap year, whereas, 2015 is not.
//
//        However, Century years like 300, 700, 1900, 2000 need to be divided by
//        400 to check whether they are leap years or not.

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year%4 == 0) {
                if (year%100 == 0) {
                    if (year%400 == 0) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }

        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
    }
}

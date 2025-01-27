/**
 * Class that determines whether or not a year is a leap year.
 *
 * @author YOUR NAME HERE
 */
public class LeapYear {

    /**
     * Calls isLeapYear to print correct statement.
     *
     * @param year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /**
     * @param year
     * @source https://sp19.datastructur.es/materials/lab/lab1/lab1#f-leap-year
     */
    private static boolean isLeapYear(int year) {
        // divisible by 400 or
        if (year % 400 == 0) return true;

        // divisible by 4 and not by 100
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }

        return false;

    }

    /**
     * Must be provided an integer as a command line argument ARGS.
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }
}


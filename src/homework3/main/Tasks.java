package homework3.main;

public class Tasks {
    public static boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }

    public static boolean numberInInterval(int n) {
        int minLimit = 25;
        int maxLimit = 100;
        return n > minLimit && n < maxLimit;
    }
}

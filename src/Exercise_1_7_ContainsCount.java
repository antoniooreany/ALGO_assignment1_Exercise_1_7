import java.util.Arrays;

public class Exercise_1_7_ContainsCount {

    private static int countNumber = 0;
    private static int index = 0;
    private static final double precision = 0.01;

    /**
     * Checks if value x is contained in arr[0..endIndex]
     *
     * @param x is a number for the search.
     * @param arr is an array in which the method is searching.
     * @param endIndex is an end index of the array, until which the search is executed.
     * @return is a number n consist in the array until index endIndex.
     */
    public static boolean contains(double x, double[] arr, int endIndex) {
        if (endIndex < 0) return false;
        if (x - arr[endIndex] > -precision && x - arr[endIndex] < precision) return true;
        return contains(x, arr, --endIndex);
    } //TODO: Is it normal that it was very difficult for me to implement this as a RECURSION.

    /**
     * Determines how often character ch occurs in array arr.
     *
     * @param ch is a character for the search.
     * @param arr arr is an array in which the method is searching.
     * @return how many times a  a character ch consist in the array arr.
     */
    public static int count(char ch, char[] arr) {
        boolean recursionFinished = false;
        if (index == 0) recursionFinished = true;
        if (index < arr.length) {
            if (ch == arr[index]) countNumber++;
            index++;
            count(ch, arr);
        }
        int result = countNumber;
        if (recursionFinished) countNumber = 0;
        index = 0;
        return result;
    } //TODO: Is it normal that it was very difficult for me to implement this as a RECURSION.


    public static void demoContains() {
        double[] a0 = {};
        double[] a1 = {3.0};
        double[] a2 = {3.0, 4.0, 8.0};

        System.out.println("a0: " + Arrays.toString(a0));
        System.out.println("3.0 contained in a0 enthalten: "
                + contains(3.0, a0, a0.length - 1));
        System.out.println("4.0 contained in a0 enthalten: "
                + contains(4.0, a0, a0.length - 1));

        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("3.0 contained in a1 enthalten: "
                + contains(3.0, a1, a1.length - 1));
        System.out.println("4.0 contained in a1 enthalten: "
                + contains(4.0, a1, a1.length - 1));

        System.out.println("a2: " + Arrays.toString(a2));
        System.out.println("3.0 contained in a2 enthalten: "
                + contains(3.0, a2, a2.length - 1));
        System.out.println("4.0 contained in a2 enthalten: "
                + contains(4.0, a2, a2.length - 1));
        System.out.println("5.0 contained in a2 enthalten: "
                + contains(5.0, a2, a2.length - 1));
        System.out.println("8.0 contained in a2 enthalten: "
                + contains(8.0, a2, a2.length - 1));
    }

    public static void demoCount() {
        char[] c1 = "mississippi".toCharArray();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println("Count " + ch + ": " + count(ch, c1));
        }
        ;

    }

    public static void main(String[] args) {
        demoContains();
        System.out.println();
        demoCount();
    }

}

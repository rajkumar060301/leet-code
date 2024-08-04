package easyLevel;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 14-Jul-23
 */

public class Q2011_finalValueAfterOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') X++;
            else X--;
        }
        return X;

    }

    public static void main(String[] args) {
        String[] array = {"++X", "++X", "X++"};
        System.out.println(finalValueAfterOperations(array));


    }

}

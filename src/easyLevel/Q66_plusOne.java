package easyLevel;

import java.util.Arrays;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 02-01-2025
 */
public class Q66_plusOne {
    static String str = "";

    public static int[] plusOne(int[] digits) {

        int[] arr = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {

            if (i == digits.length - 1) {
                arr[i] = digits[i] + 1;
            } else {
                arr[i] = digits[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] digits = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(str);

        System.out.println(str.getClass().getSimpleName());

    }

}

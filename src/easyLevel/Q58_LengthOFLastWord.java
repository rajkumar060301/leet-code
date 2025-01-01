package easyLevel;

import java.util.Scanner;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 01-01-2025
 */
public class Q58_LengthOFLastWord {

    public static int lengthOfLastWord(String s) {
        int len = 0;
        String str = s.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }

        return len;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(lengthOfLastWord(str));


    }
}

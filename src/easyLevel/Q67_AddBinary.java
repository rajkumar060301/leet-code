package easyLevel;

import java.util.Scanner;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 03-01-2025
 */
public class Q67_AddBinary {
    public static String addBinary(String a, String b) {

        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int c = 0, base = 2;
        StringBuilder res = new StringBuilder();
        while (n1 >= 0 || n2 >= 0) {
            int t1 = 0, t2 = 0, sum;
            if (n1 >= 0)
                t1 = a.charAt(n1--) - '0';
            if (n2 >= 0)
                t2 = b.charAt(n2--) - '0';
            sum = t1 + t2 + c;

            if (sum >= base) {
                c = 1;
                sum = sum - base;
            } else
                c = 0;
            res.append(sum);

        }
        if (c == 1)
            res.append(c);
        return res.reverse().toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(addBinary(s1, s2));

    }
}

package mediumLevel;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 08-01-2025
 */
public class Q43_MultiplyString {
    public static String multiply(String num1, String num2) {

        int str1 = Integer.parseInt(num1);
        int str2 = Integer.parseInt(num2);

        String multiplyString = String.valueOf(str1 * str2);


        return multiplyString;

    }


    public static void main(String[] args) {
        String s1 = "2";
        String s2 = "4";
        System.out.println(multiply(s1, s2));
    }
}

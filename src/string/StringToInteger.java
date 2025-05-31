package string;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 29-Dec-22
 */
// String to Integer
// Integer.valuesOf()
//Integer.parseInt();
//



import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Integer.parseInt(str));
        int number = Integer.valueOf(str);
        System.out.println(number);


    }
}

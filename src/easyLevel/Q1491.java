package easyLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 18-Jul-22
 */

public class Q1491 {
    public static void main(String[] args) {
        Q1491 obj = new Q1491();
        int[] arr = new int[]{1000, 2000, 3000, 5000};
        System.out.println(obj.average(arr));

    }

    public double average(int[] salary) {
        int minSalery = Integer.MAX_VALUE;
        int maxSalery = Integer.MIN_VALUE;
        for (int i = 0; i < salary.length; i++) {
            int max = Math.max(minSalery, salary[i]);
            int min = Math.min(maxSalery, salary[i]);
        }
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (minSalery != salary[i] && maxSalery != salary[i]) {
                sum = sum + salary[i];
            }

        }
        return sum / (salary.length);
    }
}

class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        if (num < 0) {
            return "-" + convertToBase7(-num);
        }

        StringBuilder builder = new StringBuilder();

        while (num != 0) {
            builder.append(num % 7);

            num /= 7;
        }

       
        return builder.reverse().toString();
    }
}
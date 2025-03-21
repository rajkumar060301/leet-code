class Solution {
    public int dayOfYear(final String date) {
        final int[] daysInMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        final String[] d = date.split("-");
        final int year = Integer.valueOf(d[0]), month = Integer.valueOf(d[1]) - 1;
        
        int day = Integer.valueOf(d[2]);

        if(month > 1 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            day += 1;

        for(int i = 0; i < month; ++i)
            day += daysInMonth[i];

        return day;
    }
}
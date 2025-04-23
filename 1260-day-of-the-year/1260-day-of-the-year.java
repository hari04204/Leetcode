class Solution {
    public int dayOfYear(String date) {
        int month = Integer.parseInt(date.substring(5,7))-1;
        int year = Integer.parseInt(date.substring(0,4));

        int[] days = { 31, (isLeapYear(year))?29:28, 31,30,31,30,31,31,30,31,30,31};
        
        int doy = 0;
        for(int i = 0; i<month; i++){
            doy+=days[i];
        }

        return doy + Integer.parseInt(date.substring(8));
    }
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}
package algorithm.calender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Calender {

    public static void main(String[] args) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int month = Integer.parseInt(bufferedReader.readLine());
            int year = Integer.parseInt(bufferedReader.readLine());
            printCalendar(month, year);

        }catch (IOException e){

            System.out.println("Error in input");

        }
    }

    /**
     * Method to print calendar
     * @param month
     * @param year
     */
    private static void printCalendar(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        calendar.set(Calendar.DAY_OF_MONTH, 1);

        int startingDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        int[][] calendarArray = new int[6][7];


        int day = 1;
        for (int week = 0; week < 6; week++) {
            for (int dayOfWeek = 0; dayOfWeek < 7; dayOfWeek++) {
                if (week == 0 && dayOfWeek < startingDayOfWeek - 1) {
                    calendarArray[week][dayOfWeek] = 0;
                } else if (day <= daysInMonth) {
                    calendarArray[week][dayOfWeek] = day;
                    day++;
                }
            }
        }

        System.out.println("Calendar for month: " + month + " year: " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int[] week : calendarArray) {
            for (int dayOfMonth : week) {
                if (dayOfMonth == 0) {
                    System.out.print("    ");
                } else {
                    System.out.printf("%3d ", dayOfMonth);
                }
            }
            System.out.println();
        }
    }

}

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calcday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
        String date = in.next();
        int year = Integer.valueOf(date.substring(0,4));
        int month = Integer.valueOf(date.substring(5,date.lastIndexOf('/')));
        int day = Integer.valueOf(date.substring(date.lastIndexOf("/")+1));
            Calendar calender = new GregorianCalendar(year,month-1,day);
            System.out.println(calender.get(Calendar.DAY_OF_YEAR));
        }
    }
}

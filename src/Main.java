import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by aleksandrap on 7/8/2018
 */
public class Main {

    public static void main(String[] args) {


        //3.3
        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        // Print dates of the current week starting on Monday
        SimpleDateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(c.getTime()));
        System.out.println();


        //3.2
        LocalDate epoch = LocalDate.ofEpochDay(0);
        LocalDate now = LocalDate.now();
        System.out.println("Years: " + ChronoUnit.YEARS.between(epoch, now));
        System.out.println("Days: " + ChronoUnit.DAYS.between(epoch, now));
        System.out.println("Weeks: " + ChronoUnit.WEEKS.between(epoch, now));
        System.out.println("Months: " + ChronoUnit.MONTHS.between(epoch, now));


        //3.1
        Date date = new Date(0);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);


        //3.4
        calendar.add(Calendar.YEAR, 1);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, -2);
        System.out.println(calendar.getTime());

    }
    }



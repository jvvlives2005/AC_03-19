package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/19/15.
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthdayCalculator {
    public static void main(String [] args) {
        Calendar c = Calendar.getInstance();
        Scanner input = new Scanner(System.in);

        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_YEAR);

        Calendar currentc = Calendar.getInstance();
        int alldays = currentc.get(Calendar.DAY_OF_YEAR);

        System.out.println("Please enter your birthday: ");
        System.out.println("What is the month? (1-12): ");
        int bmonth = input.nextInt();

        System.out.println();
        System.out.println("What is the day? (1-31): ");
        int bday = input.nextInt();
        System.out.println(day);


        int remains = 365 - bday ;

        System.out.println("There are " + remains + " days until your birthday ");
    }




}

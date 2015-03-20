package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/19/15.
 */
import java.util.Calendar;
public class Solution {
        public static void main(String[] args) {
            Calendar calendar = Calendar.getInstance();
            System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
            calendar.set(2015, 0, 30);
            int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
            System.out.println(dayOfYear);     // 317 left --- 78-30= 48; 365-48 =317
        }
    }

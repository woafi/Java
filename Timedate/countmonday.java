
import java.util.Calendar;
public class countmonday {
    public static int countMonday(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        // Note that month is 0-based in calendar, bizarrely.
        calendar.set(year, month - 1, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    
        int count = 0;
        for (int day = 1; day <= daysInMonth; day++) {
            calendar.set(year, month - 1, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.MONDAY) {
                count++;
                // Or do whatever you need to with the result.
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int year=2022;
        int month=12;
        int count=countMonday(year, month);
        System.out.println(count);
    }
    
}

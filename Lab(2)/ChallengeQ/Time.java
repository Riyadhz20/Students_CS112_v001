package time;
import java.util.GregorianCalendar;
public class Time {
    public static void main(String[] args) {
         GregorianCalendar G = new GregorianCalendar();
         
        System.out.print("Current Date: " +G.getTime()
                +"\nCurrent time (the number of milliseconds): "+G.getTimeInMillis()
                +"\nCurrent Year: " +G.get(GregorianCalendar.YEAR)
                +"\nCurrent Month: " +(G.get(GregorianCalendar.MONTH)+1)
                +"\nCurrent Day: " +G.get(GregorianCalendar.DAY_OF_WEEK)
                +"\nCurrent Week: " +G.get(GregorianCalendar.WEDNESDAY)
                +"\nCurrent DAY OF WEEK IN MONTH: " +G.get(GregorianCalendar.DAY_OF_WEEK_IN_MONTH)
                +"\nCurrent Day of Year: " +G.get(GregorianCalendar.DAY_OF_YEAR)
                +"\nCurrent Hour: " +G.get(GregorianCalendar.HOUR)
                +"\nCurrent Hour of day: " +G.get(GregorianCalendar.HOUR_OF_DAY)
                +"\nCurrent MINUTE: " +G.get(GregorianCalendar.MINUTE)
                +"\nCurrent Second: " +G.get(GregorianCalendar.SECOND)
                +"\nCurrent Millisecond: " +G.get(GregorianCalendar.MILLISECOND)
                +"\nCurrent Week of month: " +G.get(GregorianCalendar.WEEK_OF_MONTH)
                +"\nCurrent Week of year: " +G.get(GregorianCalendar.WEEK_OF_YEAR));
        
        
        long a = 1;
        for (int i=0; i<12;i++){
        G.set(G.MILLISECOND, (int)(G.MILLISECOND + a) );
        System.out.print("\nThe time after adding " + a +" millisecond(s) : " + G.getTime());
        a = a * 10;
        }
    }
}

package Day20;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Demo5 {
    public static void main(String [] args){
        System.out.println(new Date());
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss a");
        System.out.println(sdf.format(new Date()));
        System.out.println(LocalDateTime.now());
    }
}

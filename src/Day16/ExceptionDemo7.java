package Day16;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class ExceptionDemo7 {
    public static void main (String [] args){
        parseDateToString();
        try {
            parseStringToDate();
        } catch (ParseException e){
            e.printStackTrace();
        }

    }
    public  static void parseDateToString () {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS a");
        String formattedDated = sdf.format(d);
        System.out.println(formattedDated);
    }
    public static void parseStringToDate() throws ParseException {
        String s = " 2021-03-11 9:05:11AM";
        System.out.println(s);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS a");
        Date d = sdf.parse(s);
        System.out.println(d);


    }
}

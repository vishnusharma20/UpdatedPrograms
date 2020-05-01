import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class time {

    public static void main(String[] args) throws ParseException {

        String ste= "2020-04-06T12:55:06+0530";

        SimpleDateFormat dateFmt = new SimpleDateFormat("yyyyy-MM-dd'T'HH:mm:ssZ");

        Date date1 = dateFmt.parse(ste);

        System.out.println( date1);

    }
}

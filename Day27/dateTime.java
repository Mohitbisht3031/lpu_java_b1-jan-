package Day27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class dateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("currnt date is " + d); //yyy-mm-dd
        LocalDate d2 = d.plusDays(5);

        System.out.println("Date after 5 days is "+d.parse("2018-11-11"));

        LocalTime t = LocalTime.now();
        System.out.println("time now is "+t);

        LocalDateTime dt = LocalDateTime.now(); //immutable and thread safe
        System.out.println(dt);

        ZonedDateTime zt = ZonedDateTime.now(ZoneId.of("Europe/Athens"));
        System.out.println(zt);

        System.out.println(Period.between(d, d2));


        
    }
}

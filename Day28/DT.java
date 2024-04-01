package Day28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DT {
    public static void main(String[] args) {
        LocalDate ld = LocalDate . now();
        System.out.println("local date is "+ld); //yyy-mm-dd
        LocalDate ld2 = ld.plusMonths(50);
        System.out.println(ld2);

        LocalDate ld3 =LocalDate.parse("2002-11-12"); 
        System.out.println(ld3);
        LocalDate ld4 = LocalDate.of(2003,11,12);
        System.out.println(ld4);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        System.out.println(lt.plusHours(3));

        System.out.println(lt.of(23,25,24));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        ZonedDateTime zdt= ZonedDateTime.now(ZoneId.of("Europe/Athens"));
        System.out.println(zdt);

        Period p = Period.between(ld, ld2);

        System.out.println("the difference between both the dates is"+p.getMonths());

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM/yyy");
        System.out.println(" ld2 after being molded in this formater "+ld2.format(f));

        int a = 1/0;
    }
}

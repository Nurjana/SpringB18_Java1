package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_format {
    public static void main(String[] args) {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date=LocalDate.now();
        System.out.println(date.format(dtf));

       DateTimeFormatter bday=DateTimeFormatter.ofPattern("EE MMM-dd-yy");
       LocalDate date2=LocalDate.of(2014    ,4,20);
       String str=date2.format(bday);
        System.out.println(str);
       // LocalDate birthday=

    }
}

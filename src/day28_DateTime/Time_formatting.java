package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time1 =LocalTime.of(9,30);
        System.out.println(time1.format(dtf));
        LocalTime time2 =LocalTime.of(20,0);
        System.out.println(time2.format(dtf));
    }
}

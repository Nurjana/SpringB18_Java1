package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);

        LocalDate date=LocalDate.of(2020,3,20);
        LocalTime time =LocalTime.of(11,25,30);

        LocalDateTime dateTime=LocalDateTime.of(date,time);
        System.out.println(dateTime);

        LocalDateTime dateTIme2=LocalDateTime.of(2020,12,20,2,20,30);
        System.out.println(dateTIme2);
    }
}

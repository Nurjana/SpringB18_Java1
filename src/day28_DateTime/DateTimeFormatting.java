package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime datetime1=LocalDateTime.of(2015,12,24,11,24,23);
        System.out.println(datetime1);

        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("EEE, MM,dd hh:mm a");
        String date=datetime1.format(dtf);
        System.out.println(date);
    }
}

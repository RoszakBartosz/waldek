package org.roszak.daty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Data
        LocalDate localDate = LocalDate.of(2023,12,10);
        LocalDate localDateNow = LocalDate.now();

        //Data i czas
        LocalDateTime localDateTime = LocalDateTime.of(2023,12,10,4,54,30);
        LocalDateTime localDateTimeNow = LocalDateTime.now();

        //Czas
        LocalTime localTime = LocalTime.of(20,10, 20, 20);
        LocalTime localTimeNow = LocalTime.now();

        System.out.println(localTimeNow);

        //Metody
        boolean after = localDateTime.isAfter(LocalDateTime.now());
        boolean before = localDate.isBefore(LocalDate.now());
        boolean equal = localDate.isEqual(LocalDate.now());

        System.out.println(LocalDate.of(2024,12,23).isAfter(LocalDate.now()));

//         invlusive robisz !before i !after po prostu

//        if(!data.isBefore(12) && !data.isAfter(14)){
//            return true;
//        }

//        <12,14>

    }
}

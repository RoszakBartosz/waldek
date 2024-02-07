package org.roszak.kolekcje.kraje;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Countries {
   private String nameOfCountries;

     Countries(String nameOfCountries) {
        this.nameOfCountries = nameOfCountries;
     }
     public static void printNumbersOfResidents(List<Country> countries){
         Country max = countries.stream().max(Comparator.comparingInt(i -> {
             return i.getStates()
                     .stream()
                     .mapToInt(s -> s.getCities()
                             .stream()
                             .mapToInt(j -> j.getResidents())
                             .sum())
                     .sum();
         }))
                 .get();

         int sum = max.getStates()
                 .stream()
                 .mapToInt(i -> i.getCities()
                         .stream()
                         .mapToInt(s -> s.getResidents())
                         .sum())
                 .sum();

         System.out.println("the greatest country: "+max.getName());
         System.out.println("number of residents is: "+sum);
     }

}

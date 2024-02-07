package org.roszak.kolekcje;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Comparator vs Comparable
        //String i klasy od javy maja w sobie zaimplentowany compareTo

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Bella", 10));
        dogs.add(new Dog("Tymek", 12));
        dogs.add(new Dog("Szanta", 4));

        System.out.println(dogs);

        Collections.sort(dogs);

        System.out.println(dogs);

        // Dodaje wszyskie obiekty do kolekcji

        List<String> strings = new ArrayList<>();

        Collections.addAll(strings, "a", "b", "c");

        System.out.println(strings);

        //Odwraca wszystkie elemnty w danje kolekcji

        Collections.reverse(strings);

        System.out.println(strings);

        //Zwraca max wartosc, ale musisz miec comparable

        String max = Collections.max(strings);

        System.out.println(max);

        List<String> strings2 =  new ArrayList<>();
        strings2.add("a");
        strings2.add("b");

        List<String> strings1 = List.of("a", "b");

        System.out.println(strings1);


        }
}

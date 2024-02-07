package org.roszak.asocjacje;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner maciek = new Owner("Maciek");

        List<Dog> dogs = new ArrayList<>();
        Dog linux = new Dog("Linux", maciek);
        dogs.add(linux);
        Dog tymek = new Dog("Tymek", maciek);
        dogs.add(tymek);

        System.out.println(maciek);
        System.out.println(dogs);
    }
}

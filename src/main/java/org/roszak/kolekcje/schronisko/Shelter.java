package org.roszak.kolekcje.schronisko;

import java.util.*;

public class Shelter implements Comparable<Shelter> {

    private String name;
    private Map<String, Double> dogs;
    private Map<String, Double> cats;

    public Shelter(String name) {
        this.name = name;
        this.dogs = new HashMap<>();
        this.cats = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Shelter{" +
                "name='" + name + '\'' +
                ", dogs=" + dogs +
                ", cats=" + cats +
                '}';
    }


    @Override
    public int compareTo(Shelter o) {
        return 0;
    }

    public String getDogWhoEatMost(){
        String nameOfDog = dogs.entrySet()
                .stream()
                .max(Comparator.comparingDouble(s -> s.getValue()))
                .get()
                .getKey();
        return nameOfDog;
    }
    public void addDog(String name, Double food){
        this.dogs.put(name, food);
    }
    public void addCat(String name, Double food){
        this.cats.put(name, food);
    }

    public String getDogOrCatWhoEatLittlest(){
//        Map<String, Double> catsAndDogs = cats;
//        catsAndDogs.putAll(dogs);
//
//        return catsAndDogs.entrySet()
//                .stream()
//                .min(Comparator.comparingDouble(s -> s.getValue()))
//                .get()
//                .getKey();

        String dogEatLittlest = dogs.entrySet()
                .stream()
                .min(Comparator.comparingDouble(Map.Entry::getValue))
                .get()
                .getKey();
        String catEatLittlest = cats.entrySet()
                .stream()
                .min(Comparator
                        .comparingDouble(Map.Entry::getValue))
                .get()
                .getKey();

        if (dogs.get(dogEatLittlest)< cats.get(catEatLittlest)){
            return dogEatLittlest;
        } else {
            return catEatLittlest;
        }

    }
    public DogResponse getDogFromName(String name){
        DogResponse dogResponse = new DogResponse(name, dogs.get(name));
        return dogResponse;
    }
}

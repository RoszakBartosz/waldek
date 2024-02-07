package org.roszak.asocjacje;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<Dog> dogs;

    public Owner(String name) {
        this.name = name;
        this.dogs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", dogs=" + dogs +
                '}';
    }
    public void addDog(Dog dog){
        dogs.add(dog);
    }
}

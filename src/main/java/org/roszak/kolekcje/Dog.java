package org.roszak.kolekcje;

import java.util.Comparator;
public class Dog implements Comparable<Dog> {
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compare(Dog o1, Dog o2) {
//        return o1.age.compareTo(o2.age);
//    }

    @Override
    public int compareTo(Dog o) {
        return this.age.compareTo(o.age);
    }
}

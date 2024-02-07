package org.roszak.asocjacje;

public class Dog {
    private String name;
    private Owner owner;

    public Dog(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
        owner.addDog(this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", owner=" + owner.getName() +
                '}';
    }
}

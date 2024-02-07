package org.roszak.kolekcje.schronisko;

public class DogResponse {
    private String name;
    private Double food;


    public DogResponse(String name, Double food) {
        this.name = name;
        this.food = food;
    }

    @Override
    public String toString() {
        return "DogResponse{" +
                "name='" + name + '\'' +
                ", food=" + food +
                '}';
    }
}

package org.roszak.kolekcje.kraje;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private List<City> cities;

    public State(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCities(City city) {
        this.cities.add(city);
    }

}

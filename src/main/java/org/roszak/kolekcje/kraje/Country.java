package org.roszak.kolekcje.kraje;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private static List<Country> countries = new ArrayList<>();
    private String name;
    private List<State> states;

    public Country(String name) {
        this.name = name;
        this.states = new ArrayList<>();
        countries.add(this);
    }

    public String getName() {
        return name;
    }

    public static List<Country> getCountries() {
        return countries;
    }

    public List<State> getStates() {
        return states;
    }

    public void addState(State state) {
        this.states.add(state);
    }
}

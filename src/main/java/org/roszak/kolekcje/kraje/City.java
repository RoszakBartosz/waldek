package org.roszak.kolekcje.kraje;

public class City {

    private String name;
    private Integer residents;

    public City(String name, Integer residents) {
        this.name = name;
        this.residents = residents;
    }

    public String getName() {
        return name;
    }

    public Integer getResidents() {
        return residents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResidents(Integer residents) {
        this.residents = residents;
    }
}

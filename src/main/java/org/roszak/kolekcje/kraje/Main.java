package org.roszak.kolekcje.kraje;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Stworz na poczatek klaske kraj,
        //kraj ma:
        //nazwe
        //informacje o jego wojewodztwach

        //wojewodztwa maja nazwe i informacje o miastach

        //miasto ma nazwe i informacje o liczbie mieszkanców
        //Stworz klaske Countries, ktora wyszukuje najwiekszy kraj i która wyswietla liczbe mieszkancow danego kraju
        //Rozważ uzycie metod max, mapToInt i sum(), od stream() - bedzie łatwiej, ale mozna tez bez streamów
        Country poland = new Country("Poland");
        State lubuskie = new State("Lubuskie");
        poland.addState(lubuskie);
        lubuskie.addCities(new City("Świebodzin", 50000));
        lubuskie.addCities(new City("Zielona Góra", 300000));
        State mazowieckie = new State("Mazowieckie");
        poland.addState(mazowieckie);
        mazowieckie.addCities(new City("Warsaw", 2000000));


        Country albania = new Country("Albania");
        State gangAlbanii = new State("gang albanii");
        albania.addState(gangAlbanii);
        gangAlbanii.addCities(new City("chujcity", 35));

        List<Country> countries = Country.getCountries();
        Countries.printNumbersOfResidents(countries);


    }
}

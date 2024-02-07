package org.roszak.kolekcje.schronisko;

public class Main {
    public static void main(String[] args) {
        //Stwórz klaske Schronisko, które ma nazwe i
        //pieski, a kazdy z pieskow ma przydzielona dzienną ilosc jedzonka w gramach i imie
        //kotki, a kazdy z kotkow ma przydzielona dzienną ilosc jedzonka gramach i imie
        //napisz metode ktora zwraca pieska, ktory je najwięcej (jak jest pare zwroc jednego, byle jaki)
        //napisz metode ktora zwraca pieska lub kotka, ktory je najmniej (jak jest pare zwroc jednego, byle jaki)
        //napisz metode ktora zwraca pieska i jego ilosc karmy o danym imieniu
        //Nie mozesz tworzyc innych klas, ani subklas, prócz schronisko i main
        Shelter zg = new Shelter("ZG");
        zg.addDog("Bella", 1000.0);
        zg.addDog("Tymek", 999999.0);
        zg.addDog("Luna", 99999.0);
        zg.addCat("Szogun", 999999999.0);
        zg.addCat("parowczak", 50.0);
        System.out.println(zg.getDogWhoEatMost());

        String dogOrCatWhoEatLittlest = zg.getDogOrCatWhoEatLittlest();
        System.out.println(dogOrCatWhoEatLittlest);
        DogResponse dogResponse = zg.getDogFromName("Bella");
        System.out.println(dogResponse);
    }

}

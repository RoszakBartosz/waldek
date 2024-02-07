package org.roszak.szkolarodzneia;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    //stowrzymy dwie klasy Kid i Mother, i teraz tak:
    // matka ma miec id, Imie, i Liste( nie doslownie liste, jakas kolekcje) dzieci
    // dziecko ma miec id, imie i mame
    // zwroc mamy ktore maja wiecej niz jedno dziecko

    public static void main(String[] args) {
        Mother kaja = new Mother(1L, "Kaja");
        Mother kasperska = new Mother(1L, "Kasperska");

        Kid malyFilfipe = new Kid(4L, "Maly filfipe", kasperska);

        Kid maciej = new Kid(1L, "Maciej", kaja);
        Kid tymek = new Kid(2L, "Tymek", kaja);
        Kid demble = new Kid(3L, "demble", kaja);

        Set<Kid> kidoss = new HashSet<>();
        kidoss.add(maciej);
        kidoss.add(tymek);
        kidoss.add(demble);

        kaja.setKids(kidoss);

        Set<Kid> fiflep = new HashSet<>();
        fiflep.add(malyFilfipe);

        kasperska.setKids(fiflep);

        List<Mother> mothers = new ArrayList<>();
        mothers.add(kaja);
        mothers.add(kasperska);

        System.out.println(kaja);
        System.out.println(kasperska);

        System.out.println(Mother.hasMoreKidsThanOne(mothers));

    }

}

package org.roszak.stringi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //https://www.samouczekprogramisty.pl/string-cache-i-stringbuilder-w-praktyce/
        //https://javastart.pl/baza-wiedzy/klasy/string-stringbuffer-i-stringbuilder

        /*Instancje klasy String reprezentują łańcuchy znaków.
         * Wewnętrznie znaki te przetrzymywane są w tablicy znaków.
         * Tablica ta ma typ char[].
         * Implementacja klasy String chowa przed programistą mechanizmy operowania na tej tablicy.
         * W języku Java Stringi zostały utworzone jako niemodyfikowalne - oznacza, to, że nie możemy na przykład
         * dynamicznie dodawać do tego samego ciągu znaków czegoś nowego,
         * aby tego dokonać zawsze tworzymy nowy obiekt String.
         */




//        String tekst = "agata";
//
//        tekst += "xd";
//
//        System.out.println(tekst);
//
//
//        System.out.println(tekst.hashCode());
//
//        System.out.println(tekst.toLowerCase() == "agata");

        //repalce

        String txt = "Ala ma kota  ";

        System.out.println(txt);
        System.out.println(txt.replace('a', '#'));
        System.out.println(txt);

        //substring - zwraca pewna czesc lancucha znakow okreslona indeksem
        System.out.println(txt.substring(1));
        System.out.println(txt.substring(1, 5));

        //trim zwraca nowa instacnje bez poczatkowych i koncowych bialych znakow
        System.out.println(txt.trim());

        //Por�wnuje dwa stringi leksykograficznie

        //Zwraca 0 jesli Stingi sa takie same
        //liczbe ujemna jesli String z parametru jest wiekszy leksykograficznie
        //liczbe dodatnia jesli String z parametru jest mniejszy leksykograficznie
        //najpierw sa cyfry, potem wielkie litery, potem male
        System.out.println("Compare: " + "abc".compareTo("tbc"));

        //zwraca kod ascii literki o danym indeksie
        System.out.println(txt.codePointAt(0));
        //zwraca kod ascii literki przed danym indeksem
        System.out.println(txt.codePointBefore(1));

        //ignoruje wielkie litery
        System.out.println("abc".compareToIgnoreCase("ABC"));

        //sprawdza czy string zawiera podany ciag znakow
        System.out.println("abcd".contains("bc"));
        System.out.println("abcd".contains("ac"));

        //czy string sie konczy na to co w parametrze
        System.out.println("Ends with " + "abc".endsWith("bc"));
        System.out.println("abc".startsWith("ab"));

        //metoda equals
        System.out.println("abc".equals("abc"));
        System.out.println("ABC".equalsIgnoreCase("abc"));

        //zwraca indeks wystapienia chara
        //zwraca -1 jesli znaku nie ma w stringu
        System.out.println("abc".indexOf('a'));
        System.out.println("Last index: " + "abcdeb".lastIndexOf('b'));
        System.out.println("Last index: " + "abcdefg".lastIndexOf('c', 1));

        //sprawdza czy string sklada sie z samych whitespacow
        System.out.println("is blank: " + "   ".isBlank());

        //powtarza kilka razy stringa
        System.out.println("abc".repeat(5));

        System.out.println("SPLIT");
        //splituje stringa wzgledem regexa
        String[] tablica = "ala ma kota".split(" ");

        for (String x : tablica) {
            System.out.println(x);
        }

        String a = "hejka";
        String b = "hejka";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println();

        //wywołując konstruktor poprzez użycie new String() wymuszamy na programie utworzenie nowego obiektu w pamięci.
        // Kiedy wpisujemy String w cudzysłowiach, jest to wartość którą program tworzy i przechowuje w swojej pamięci
        // w tzw string pool. Gdy chcemy utworzyć kolejny obiekt używając tego samego sposobu i wartości,
        // to program sprawdza najpierw czy w string pool taka wartość już się znajduje. Jeśli tak, to mówi "hey,
        // mam już taki obiekt, nie twórzmy nowego" i twojej zmiennej wskazuje adres tego obiektu.
        // Efektem tego jest zwracanie true w przypadku użycia operatora ==. Obiekty tworzone z użyciem
        // słowa kluczowego (czy operatora) "new" nie sięgają do String pool, tylko są przechowywane w heap space.


        String car = "samochod";
        System.out.println(car);

        car = new StringBuilder(car).append(" lambo").toString();
        System.out.println(car);

        //to co poniżej, pod spodem robi to samo co ten potworek u góry
        car += " huracan";
        System.out.println(car);





        String z = "a";
        long start = System.nanoTime(); // nanoTime() zwraca w miare dokladny czas JVM
        for (int i = 0; i < 10000; i++) {
            z += "z";
        }
        long czas = System.nanoTime() - start;
        System.out.println("Czas String: " + czas);

        String g = "a";
        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder(g);
        for (int i = 0; i < 10000; i++) {
            sb.append("z");
        }
        g = sb.toString();
        long czas2 = System.nanoTime() - start2;
        System.out.println("Czas StringBuilder: " + czas2);

        StringBuilder builder = new StringBuilder("Ala ma kota");

        System.out.println(builder.reverse());  //odwrócenie kolejności znaków
        System.out.println(builder.delete(1,4));    //usunięcie znaków na indeksach od (włącznie) do (wyłącznie)

        //5
        // Stwórz kolekcję Stringów.
        // Wyświetl wszystkie Stringi odwrócone np kot ma być tok itd.



        List<String> strings = new ArrayList<>();
        strings.add("kot");
        strings.add("pies");
        strings.add("hipopotam");
        strings.add("chuj");
        strings.add("dembele");

        List<String> list = strings.stream()
                .map(s -> new StringBuilder(s)
                        .reverse()
                        .toString())
                .toList();
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println(list);
    }


}

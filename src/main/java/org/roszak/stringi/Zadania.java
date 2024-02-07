package org.roszak.stringi;

import java.util.ArrayList;
import java.util.List;

public class Zadania {
    public static void main(String[] args) {

        // Przetestuj i porównaj obiekty klasy StringBuffer i StringBuilder.
        // Co wypadnie lepiej w teście szybkości?
        // W klasie StringBuffer też mamy dostępną metodę appened().
        // jakie sa zastosowania stringbuffer i w czym jest lepszy od stringbuilder?

        testTimeBuilderAndBuffer();

        // Główna różnica pomiędzy StringBuilder a StringBuffer jest taka, że StringBuffer jest synchronizowany,
        // a StringBuilder nie. Jeśli chodzi o czas wykonania operacji, StringBuilder wypada szybciej.
        //Natomiast przy dodawaniu liter w wielowątkowości StringBuilder rzuca wyjątkiem, lub ucina dużą wartość znaków,
        //co przy StringBufferze nie występuje.
        //ZASTOSOWANIE:

        //do manipulacji łańcuchami znaków potrzebny jest StringBuilder
        //w aplikacjach wielowątkowych przydatny jest StringBuffer (chociaż zalecam użycie StringBuildera + jawna synchronizacja)


        //Napisz metodę ktora bedzie przyjmowac liste stringow i zwroci je skonkatenowane - nie
        //mozesz uzywac zwyklej konkatenacji

        List<String> strings = new ArrayList<>();
        strings.add("Dembele ");
        strings.add("jest ");
        strings.add("głupi jak but");
        String s = contatinationListOfStrings(strings);
        System.out.println(s);

        //Napsz metodę, która przyjmnie 2 stringi i zwróci ciąg (String) ich wspólnych liter
        //np. ("radek","tacrka") -> "rak" / tak ten blad w taczka spelcjanie



        String s1 = returnContainsChars("radek", "tacrka");
        System.out.println(s1);

        //Napisz metodę, która przyjmuje liste stringów i zwraca liste ich srodkowych liter (1 lub 2, zalezy czy jest
        // parzysta dlugosc czy nie)
        //jesli string ma białe znakie (spacje, \n), to je usuń i wtedy zwróc srodkowe litery/e
        //np. ["Kot", "Kawa", "Ala ma kota"] -> ["o", "aw", "a"]

        List<String> strings1 = returnMiddleLetters(strings);
        System.out.println(strings1);
        //Napisz metodę która rozdziela liste stringów, jesli występuje w nich spacja
        //np. ["a b", "c", "pies który szczeka ogonem"] -> ["a", "b", "c", "pies", "który", "szczeka", "ogonem"]
        //zauwaz ze rozmiar na poczatku talbicy to 3, a na koncu 7
        //mozesz zwrocic nową liste

        List<String> strings2 = returnSplitStrings(strings);
        System.out.println(strings2);
        //TODO


    }
    public static void testTimeBuilderAndBuffer(){
        long start = System.nanoTime();
        StringBuilder ab = new StringBuilder("a");
        for (int i = 0; i < 10000; i++) {
            ab.append("a");
        }

        String string1 = ab.toString();
        long czas = System.nanoTime() - start;
        System.out.println("Czas StringBuilder: "+czas);

        long start2 = System.nanoTime();
        StringBuffer ac = new StringBuffer("a");
        for (int i = 0; i < 10000; i++) {
            ac.append("a");

        }
        ac.toString();

        long czas2 = System.nanoTime() - start2;
        System.out.println("Czas StringBuffer: "+czas2);
    }
    public static String contatinationListOfStrings(List<String> strings){
        StringBuilder a = new StringBuilder();
        for (String s: strings) {
            a.append(s);
        }
        String string = a.toString();
        return string;
    }

    public static String returnContainsChars(String a, String b){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (b.contains(String.valueOf(c))){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
    public static List<String> returnMiddleLetters(List<String> strings) {
        List<String> middle = new ArrayList<>();
        for (String s : strings) {
            s = s.replaceAll("\\s+", "");
            if (s.length() % 2 == 0) {
                int i = s.length() / 2;
                middle.add(s.substring(i - 1, i+1));
            } else {
                int i = s.length() / 2;
                middle.add(s.substring(i, i+1));
            }

        }
        return middle;
    }
    public static List<String> returnSplitStrings(List<String> strings){
        List<String[]> strings1 = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();


        for (String s: strings){
            strings1.add(s.split(" "));
        }
        strings1.stream().forEach(s -> {
            for (String a: s) {
                strings2.add(a);
            }
        });

        return strings2;
    }
}


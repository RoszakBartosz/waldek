package org.roszak.bank;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Notatki {
    public static void main(String[] args) {
        /*
         * Ich uzywanie w tradycyjnych programach nie jest zbyt wygodne, poniewaz nie
         * mozna zrobic bezposredniego przypisania wartosci BigInteger przykladowo do
         * wartosci int (ani odwrotnie), pomimo ze BigInteger przechowywalaby liczbe z
         * zakresu int. Jest to spowodowane tym, ze klasa BigInteger jest typem
         * obiektowym, a do zmiennych typu int nie mozna przypisywac obiektow. Nie
         * istnieje tez zadna automatyczna konwersja miedzy takimi wartosciami.
         */


        BigInteger first = new BigInteger("5");
        BigInteger sec = new BigInteger("5");

        System.out.println(first == sec);

        System.out.println(first.equals(sec));

        // sta�e reprezentujace 0,1,2,10
        System.out.println(BigInteger.ZERO);
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.TWO);
        System.out.println(BigInteger.TEN);

        // string zeby moglo wykraczac poza zakres intow longow
        BigInteger a = new BigInteger("552");
        BigInteger b = new BigInteger("5");
        System.out.println(a);

        // drugi sposob z metoda valueOf, tylko tutaj mamy max longa
        BigInteger wielkaLiczba = BigInteger.valueOf(123123);


        // dodawanie
        BigInteger suma = a.add(b);
        System.out.println("Suma " + suma);

        // odejmowanie
        BigInteger roznica = a.subtract(b);
        System.out.println("Roznica " + roznica);

        // mnozenie
        BigInteger iloczyn = a.multiply(b);
        System.out.println("Iloczyn " + iloczyn);

        // dzielenie
        BigInteger dzielenie = a.divide(b);
        System.out.println("Dzielenie " + dzielenie);

        /*
         * Obiekty BigInteger i BigDecimal s� niemodyfikowalne, podobnie jak obiekty
         * typu String. Z tego powodu wywo�anie np. metody add() nie modyfikuje warto�ci
         * obiektu przypisanego do zmiennej a, zamiast tego zwracany jest nowy
         * obiekt, b�d�cy sum� dodawanych warto�ci.
         */

        BigInteger c = new BigInteger("7");
        BigInteger d = new BigInteger("552");
        // ilosc bit�w potrzebnych do zapisu
        System.out.println("big length " + c.bitLength());
        // sumuje liczbe bit�w
        System.out.println("big count " + c.bitCount());

        // por�wnuje dwa BigInty
        // 1 jesli c>d
        // 0 jesli c=d
        // -1 jesli c<d

        int ab = 5;
        System.out.println(c.compareTo(new BigInteger(String.valueOf(ab))));

        System.out.println();

        // zamiana na doubla, E oznacza 10^n
        BigInteger f = new BigInteger("10000000000");
        double rzeczywista = f.doubleValue();
        System.out.println(rzeczywista);

        System.out.println("ASD");
        int calkowita = f.intValue();
        System.out.println(calkowita);
        System.out.println(f.hashCode());

        // por�wnuje z obiektem
        System.out.println(c.equals(4));
        Integer n = 4;
        System.out.println(c.equals(b));

        System.out.println(c.equals(c));

        System.out.println();

        // zwraca wieksza z dwoch
        System.out.println("wieksza " + d.max(c));
        // mniejsza z dwoch
        System.out.println("mniejsza " + c.min(d));

        System.out.println();
        BigInteger z = new BigInteger("5");
        BigInteger y = new BigInteger("-17");

        // reszta z dzielenia, -17 mod 5 = 3
        System.out.println("modulo " + y.mod(z));

        // reszta z dzielenia, 17 mod 5 = 2
        System.out.println("modulo " + y.modInverse(z));

        // sprawdza czy jest liczb� pirwsza z pewna dokladnoscia
        System.out.println(y.isProbablePrime(1));

        // wartosc bezwzgledna
        System.out.println(y.abs());

        // podnosi z do potegi int
        System.out.println(z.pow(4));

        // liczba przeciwna
        System.out.println(z.negate());

        // zwraca signum,
        // czyli 1 jesli > 0
        // 0 jesli =0
        // -1 jesli < 0
        System.out.println(z.signum());

        // pierwiastek
        System.out.println("pierwiastek");
        BigInteger z1 = new BigInteger("16");
        System.out.println(z1.sqrt());

        // przesuniecia bitowe
        System.out.println(z1.shiftLeft(2));
        System.out.println(z1.shiftRight(2));

        BigDecimal bd = new BigDecimal("-4.543");
        // laczna liczba cyfr znaczacych
        System.out.println(bd.precision());

        // liczba cyfr na prawo od kropki
        System.out.println(bd.scale());
    }
}

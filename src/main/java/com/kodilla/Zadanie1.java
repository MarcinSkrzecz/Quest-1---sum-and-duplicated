package com.kodilla;

import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
        int suma1 = sumaTablicy(new int[]{1, 2, 3, 4, 10, 11});
        int suma2 = sumaTablicy(new int[]{338, 65, 713, 595, 428, 610, 728, 573, 871, 868});

        if(suma1 == 31 && suma2 == 5789) {
            System.out.println("Suma została obliczona poprawnie");
        } else {
            System.out.println("Suma została obliczona błędnie");
        }
        long sumaDuzych1 = sumaDuzychLiczb(new long[]{1000000001l, 1000000002l, 1000000003l, 1000000004l, 1000000005l});
        long sumaDuzych2 = sumaDuzychLiczb(new long[]{10000000000l, 20000000000l, 30000000000l, 1000000004l, 1000000005l});

        if(sumaDuzych1 == 5000000015l && sumaDuzych2 == 62000000009l) {
            System.out.println("Suma dużych liczb została obliczona poprawnie");
        } else {
            System.out.println("Suma dużych liczb została obliczna błędnie");
        }

        int pair1 = numberOfPairs(new int[]{10, 20, 20, 10, 10, 30, 30, 10, 20});
        int pair2 = numberOfPairs(new int[]{20, 20});
        int pair3 = numberOfPairs(new int[]{10, 20, 30, 40, 50});
        if(pair1 == 3 && pair2 == 1 && pair3 == 0) {
            System.out.println("Znaleziono poprawną liczbę par");
        } else {
            System.out.println("Znaleziono błędną liczbę par" + " " + pair1 + " " + pair2 + " " + pair3);
        }
    }

    private static Integer sumaTablicy(int[] array) {
        int suma1 = 0;
        for(int i = 0; i < array.length; i++) {
            suma1 += array[i];
        }
        return suma1;
    }

    private static Long sumaDuzychLiczb(long[] array) {
        long suma2 = 0l;
        for(int j = 0; j < array.length; j++) {
            suma2 += array[j];
        }
        return suma2;
    }
    //10,10,10,10,  20,20,20,  30,30
    private static Integer numberOfPairs(int[] array) {
        Arrays.sort(array);
        int ilosc = 0;
        for(int a = 1; a < array.length - 1; a++) {
            if(array[a - 1] == array[a] && array[a] != array[a + 1]) {
                ilosc += 1;
            }
        }
        if(array[array.length - 1] == array[array.length - 2]) {
            ilosc += 1;
        }
        return ilosc;
    }
}

//w argumencie metoda przyjmuje tablicę liczb
//wyświetl/zwróć liczbę par znajduje się w tablicy
//przykład 1: tablica zawiera: 10, 10, 20, wynik: w tablicy znajduje się jedna para
//przykład 2: tablica zawiera: 10, 20, 30, wynik: w tablicy nie znajduje się żadna para
//przykład 3: tablica zawiera: 20, 20, 30, 40, 20, wynik: w tablicy znajduje się jedna para
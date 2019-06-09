import javafx.scene.control.RadioButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Listy_zad01_Dom_Z_Gwiazdka {
/*
   Lista wczytujaca ilosc liczb od uzytkownika oraz generujaca losowo ilosc liczb podana przez uzytkownika
   Stwórz listę Integerów. Wykonaj zadania:
    - dodaj do listy 5 elementów ze scannera
    - dodaj do listy 5 elementów losowych
    - wypisz elementy
    - wypisz średnią elementów
Sprawdź działanie aplikacji.
** zmodyfikuj aplikację, zamiast pobierać/losować 5 elementów na początku aplikacji zapytaj użytkownika ile elementów
 ma być wylosowanych, a ile ma być wczytanych.
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Ile elementow chcesz wprowadzic ?");
        int iloscElementowDoWpisania = sc.nextInt();

        System.out.println("Ile elementow program ma wylosowac automatycznie");
        int iloscElemenetowLosowych = sc.nextInt();

        System.out.println("Podaj liczby");
        for(int i=0; i<iloscElementowDoWpisania; i++){
            list.add(sc.nextInt());
        }

        System.out.println("Losuje ");
        for(int i=0; i<iloscElemenetowLosowych;i++){
            list.add(rand.nextInt(10));

        }

        System.out.println("lista =" + list);

    }

}

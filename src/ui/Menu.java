package ui;

import java.util.Scanner;

public class Menu {

    public void wyswietl() {

        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - usun alkohol");
        System.out.println("3 - wyswietl");
        System.out.println("q - wyjdź");
    }

    public void podaj() {
        Scanner in = new Scanner(System.in);

        String wybor;

        do {
            System.out.println("wybierz: ");


            wybor = in.nextLine();

            switch (wybor) {
                case "1":
                    System.out.println("Dodaj Alkohol");
                    break;
                case "2":
                    System.out.println("Usun Alkohol");
                    break;
                case "3":
                    System.out.println("Wyswietl Alkohol");
                    break;
                case "q":
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Błędna opcja, podaj jeszcze raz: ");
            }
        } while (!wybor.equals("q"));


    }
}
package ui;

import model.Alkohol;
import model.Papierosy;
import model.Sklep;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Alkohol> alkohole;
    private List<Papierosy> papierosies;


    public void wyswietl() {

        System.out.println("1 - dodaj alkohol");
        System.out.println("2 - dodaj papierosy");
        System.out.println("2 - usun");
        System.out.println("4 - wyswietl");
        System.out.println("q - wyjdź");
    }

    public void podaj() {
        Scanner in = new Scanner(System.in);
        Sklep sklep = new Sklep("Wielbłąd");

        String wybor;

        do {
            System.out.println("wybierz: ");

            wybor = in.nextLine();

            switch (wybor) {
                case "1": {
                    System.out.println("Dodaj Alkohol");
                    System.out.println("Nazwa: ");
                    String nazwa = in.nextLine();
                    System.out.println("Cena: ");
                    BigDecimal cena = in.nextBigDecimal();
                    in.nextLine();
                    System.out.println("Pojemność: ");
                    String litraz = in.nextLine();
                    System.out.println("Procent: ");
                    String procent = in.nextLine();

                    Alkohol alkohol = new Alkohol(nazwa, cena, litraz, procent);
                    sklep.dodaj(alkohol);
                    System.out.println("Dodano nową pozycję");
                }

                break;

                case "2": {
                    System.out.println("Dodaj Papierosy");
                    System.out.println("Nazwa: ");
                    String nazwa = in.nextLine();
                    System.out.println("Cena: ");
                    BigDecimal cena = in.nextBigDecimal();
                    in.nextLine();
                    System.out.println("Rodzaj: ");
                    String rodzaj = in.nextLine();
                    System.out.println("Sztuki: ");
                    int sztuki = in.nextInt();
                    in.nextLine();

                    Papierosy papierosy = new Papierosy(nazwa, cena, rodzaj, sztuki);
                    sklep.dodaj(papierosy);
                    System.out.println("Dodano nową pozycję");
                }

                break;

                case "3": {
                    System.out.println("Usun");
                    System.out.println("Podaj ID produktu: ");
                    int id = in.nextInt();
                    in.nextLine();
                    sklep.usun(id);
                    System.out.println("Usunięto pozycję o id: " + id);
                    break;
                }

                case "4":
                    System.out.println(sklep);
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